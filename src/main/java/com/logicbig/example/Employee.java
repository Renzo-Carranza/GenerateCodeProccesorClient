/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbig.example;

import com.logicbig.example.annotation.ImplementCrud;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author renzo
 */
@Entity
@Table(name = "employee")
@ImplementCrud(pathRest = "/crudEmployee", packageSave = "com.logicbig.AnnotssationxxsJava")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private Long id;

    @Column(name = "emp_name", length = 50, nullable = true)
    private String empName;

    @Column(name = "emp_designation", length = 50, nullable = true)
    private String empDesignation;

    @Column(name = "emp_salary", nullable = true)
    private Float empSalary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(Employee employee) {
        this.empDesignation = employee.getEmpDesignation();
        this.empName = employee.getEmpName();
        this.empSalary = employee.getEmpSalary();
    }

    public Employee() {
    }

}
