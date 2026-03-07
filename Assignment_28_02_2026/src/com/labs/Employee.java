package com.labs;

import java.time.LocalDate;

public class Employee {

    private Integer empId;
    private String fName;
    private String lName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private String designation;
    private double sal;
    private Integer mgrId;
    private Department dept;

    public Employee(Integer empId, String fName, String lName,
                    String email, String phoneNumber, LocalDate hireDate,
                    String designation, double sal, Integer mgrId,
                    Department dept) {

        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.designation = designation;
        this.sal = sal;
        this.mgrId = mgrId;
        this.dept = dept;
    }

    public Employee() {
    }

    public Integer getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.empId = employeeId;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String firstName) {
        this.fName = firstName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lastName) {
        this.lName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return sal;
    }

    public void setSalary(double salary) {
        this.sal = salary;
    }

    public Integer getManagerId() {
        return mgrId;
    }

    public void setManagerId(Integer managerId) {
        this.mgrId = managerId;
    }

    public Department getDepartment() {
        return dept;
    }

    public void setDepartment(Department department) {
        this.dept = department;
    }

    @Override
    public String toString() {
        return fName + " " + lName + " - " + sal;
    }
}
