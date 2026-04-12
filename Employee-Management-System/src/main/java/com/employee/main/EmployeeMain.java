package com.employee.main;

import com.employee.controller.EmployeeController;
import com.employee.entity.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeController employeeController = new EmployeeController();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n\n*** Welcome to Employee Management System. ***");
            System.out.println("1.Add New Employees.");
            System.out.println("2.Update Employee.");
            System.out.println("3.Get Employee By Id");
            System.out.println("4.Get All Employee");
            System.out.println("5.Delete Employee By Id");
            System.out.println("6.Get Male Employee Only.");
            System.out.println("7.Get Female Employee Only.");
            System.out.println("8.Exit in Application.");

            System.out.println("\nPlease select the Operation on Employee :");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Enter Employee ID :");
                int empId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter Employee Name :");
                String empName = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter Employee Salary :");
                double empSalary = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter Employee Department :");
                String empDep = scanner.nextLine();

                System.out.println("Enter Employee Gender :");
                String empGender = scanner.nextLine();

                System.out.println("Enter Employee City :");
                String empCity = scanner.nextLine();

                employee.setEmpId(empId);
                employee.setEmpName(empName);
                employee.setEmpSalary(empSalary);
                employee.setEmpDep(empDep);
                employee.setEmpGender(empGender);
                employee.setEmpCity(empCity);

                String msg = employeeController.saveEmployee(employee);
                System.out.println(msg);
            } else if (choice == 2) {
                System.out.println("Enter Employee ID :");
                int empId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter Employee Name :");
                String empName = scanner.nextLine();

                System.out.println("Enter Employee Salary :");
                Double empSalary = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter Employee Department :");
                String empDep = scanner.nextLine();

                System.out.println("Enter Employee Gender :");
                String empGender = scanner.nextLine();

                System.out.println("Enter Employee City :");
                String empCity = scanner.nextLine();

                employee.setEmpId(empId);
                employee.setEmpName(empName);
                employee.setEmpSalary(empSalary);
                employee.setEmpDep(empDep);
                employee.setEmpGender(empGender);
                employee.setEmpCity(empCity);

                String msg = employeeController.updateEmployee(employee);
                System.out.println(msg);

            } else if (choice == 3) {
                System.out.println("Enter Employee ID :");
                int empId = scanner.nextInt();

               employee = employeeController.getEmployeeById(empId);

                System.out.println("Employee Name :"+employee.getEmpName());
                System.out.println("Employee Salary :"+employee.getEmpSalary());
                System.out.println("Employee Department :"+employee.getEmpDep());
                System.out.println("Employee Gender :"+employee.getEmpGender());
                System.out.println("Employee City :"+employee.getEmpCity());
                System.out.println("===================================================");

            } else if (choice == 4) {

                List<Employee> employeeList = employeeController.getAllEmployee();

                for (Employee employee1 : employeeList){
                    System.out.println("Employee Id :"+employee1.getEmpId());
                    System.out.println("Employee Name :"+employee1.getEmpName());
                    System.out.println("Employee Salary :"+employee1.getEmpSalary());
                    System.out.println("Employee Department :"+employee1.getEmpDep());
                    System.out.println("Employee Gender :"+employee1.getEmpGender());
                    System.out.println("Employee City :"+employee1.getEmpCity());
                    System.out.println("===================================================");
                }

            } else if (choice == 5) {
                System.out.println("Enter Employee Id :");
                int empId = scanner.nextInt();
                String msg = employeeController.deleteEmployeeById(empId);
                System.out.println(msg);

            } else if (choice == 6) {
                ArrayList<Employee> employees = employeeController.getAllMaleEmployee();

                for(Employee employee1 : employees){
                    System.out.println("Employee Id :"+employee1.getEmpId());
                    System.out.println("Employee Name :"+employee1.getEmpName());
                    System.out.println("Employee Salary :"+employee1.getEmpSalary());
                    System.out.println("Employee Department :"+employee1.getEmpDep());
                    System.out.println("Employee Gender :"+employee1.getEmpGender());
                    System.out.println("Employee City :"+employee1.getEmpCity());
                    System.out.println("===================================================");
                }

            } else if (choice == 7) {
                ArrayList<Employee> employees = employeeController.getAllFemaleEmployee();

                for(Employee employee1 : employees){
                    System.out.println("Employee Id :"+employee1.getEmpId());
                    System.out.println("Employee Name :"+employee1.getEmpName());
                    System.out.println("Employee Salary :"+employee1.getEmpSalary());
                    System.out.println("Employee Department :"+employee1.getEmpDep());
                    System.out.println("Employee Gender :"+employee1.getEmpGender());
                    System.out.println("Employee City :"+employee1.getEmpCity());
                    System.out.println("===================================================");
                }

            }  else if (choice == 8) {
                System.out.println("Thank you");
                break;
            }else {
                System.out.println("Invalid Choice,Please try Against");
            }
        }
    }

}
