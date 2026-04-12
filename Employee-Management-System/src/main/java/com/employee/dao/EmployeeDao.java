package com.employee.dao;

import com.employee.config.HibernateConfig;
import com.employee.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao {

    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    public String saveEmployee(Employee employee){

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee);
        transaction.commit();
        session.close();

        return "Employee Save SuccessFully";

    }

    public String updateEmployee(Employee employee){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee existingEmployee = session.get(Employee.class,employee.getEmpId());
        existingEmployee.setEmpName(employee.getEmpName());
        existingEmployee.setEmpSalary(employee.getEmpSalary());
        existingEmployee.setEmpDep(employee.getEmpDep());
        existingEmployee.setEmpGender(employee.getEmpGender());
        existingEmployee.setEmpCity(employee.getEmpCity());
        existingEmployee.setEmpId(employee.getEmpId());

        session.merge(employee);
        transaction.commit();
        session.close();

        return "Employee Update SuccessFully";
    }

    public Employee getEmployeeById(int empId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.createQuery("FROM Employee e WHERE e.empId = :empId",Employee.class)
                .setParameter("empId",empId).uniqueResult();

        transaction.commit();
        session.close();

        return employee;
    }

    public List<Employee> getAllEmployee(){
        Session session = sessionFactory.openSession();
        List<Employee> employeeList = session.createQuery("from Employee").list();

        return employeeList;
    }

    public String deleteEmployeeById(int empid){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class,empid);

        session.delete(employee);
        transaction.commit();
        session.close();

        return "Employee Delete SuccessFully";
    }



}
