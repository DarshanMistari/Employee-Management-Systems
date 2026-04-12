package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @Column (name = "empId")
    private int empId;

    @Column (name = "empName")
    private String empName;

    private double empSalary;

    private String empDep;

    private String empGender;

    private String empCity;

}
