package com.cg.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.apache.logging.log4j.util.InternalApi;

import java.time.LocalDate;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_id;
    private String name;
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private LocalDate dob;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int empid) {
        this.emp_id = empid;
    }

    public Employee(String name, LocalDate dob, Double salary) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public Employee() {

    }
}

