package com.cg.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private int EmployeeId;
    private String fullName;
    private LocalDate dateofbirth;
    private double salary;

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeDTO(String fullName, LocalDate dateofbirth, double salary) {
        this.fullName = fullName;
        this.dateofbirth = dateofbirth;
        this.salary = salary;
    }

    public EmployeeDTO() {
    }
}
