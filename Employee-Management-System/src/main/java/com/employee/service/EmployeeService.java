package com.employee.service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    EmployeeDao employeeDao = new EmployeeDao();

    public String saveEmployee(Employee employee){
        String msg = employeeDao.saveEmployee(employee);
        return msg;
    }

    public String updateEmployee(Employee employee){
        String msg = employeeDao.updateEmployee(employee);
        return msg;
    }

    public Employee getEmployeeById(int empId){
        return employeeDao.getEmployeeById(empId);
    }


    public List<Employee> getAllEmployee(){

        return employeeDao.getAllEmployee();
    }

    public String deleteEmployeeById(int empid){
        String msg = employeeDao.deleteEmployeeById(empid);
        return msg;
    }


    public ArrayList<Employee> getAllMaleEmployee(){
        ArrayList<Employee> employeeList = (ArrayList<Employee>) employeeDao.getAllEmployee();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee  : employeeList){
            if(employee.getEmpGender().equals("Male")){
                maleEmployees.add(employee);
            }
        }

        if(maleEmployees.isEmpty()){
            System.out.println("Male Employee is Not Found.");
        }

        return maleEmployees;
    }

    public ArrayList<Employee> getAllFemaleEmployee(){
        ArrayList<Employee> employeeList = (ArrayList<Employee>) employeeDao.getAllEmployee();
        ArrayList<Employee> FemaleEmployees = new ArrayList<>();

        for (Employee employee  : employeeList){
            if(employee.getEmpGender().equals("Female")){
                FemaleEmployees.add(employee);
            }
        }

        if(FemaleEmployees.isEmpty()){
            System.out.println("Female Employee is Not Found.");
        }
        return FemaleEmployees;
    }


}
