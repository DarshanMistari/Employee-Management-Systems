package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    public String saveEmployee(Employee employee){
        String msg = employeeService.saveEmployee(employee);
        return msg;
    }

    public String updateEmployee(Employee employee){
        String msg = employeeService.updateEmployee(employee);
        return msg;
    }

    public Employee getEmployeeById(int empId){
        return employeeService.getEmployeeById(empId);
    }

    public List<Employee> getAllEmployee(){

        return employeeService.getAllEmployee();
    }

    public String deleteEmployeeById(int empId){
        String msg = employeeService.deleteEmployeeById(empId);
        return msg;
    }

    public ArrayList<Employee> getAllMaleEmployee(){
        return employeeService.getAllMaleEmployee();
    }

    public ArrayList<Employee> getAllFemaleEmployee(){
        return employeeService.getAllFemaleEmployee();
    }
}
