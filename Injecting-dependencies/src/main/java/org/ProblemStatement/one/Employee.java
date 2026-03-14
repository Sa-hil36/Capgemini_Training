package org.ProblemStatement.one;

public class Employee {
    private int employeeId;
    private String employeeName;
    private float salary;
    private String businessUnit;
    private int age;

//    public SUB getSUBDetails(){
//        return businessUnit;
//    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int employeeId, String employeeName, float salary, String businessUnit, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.businessUnit = businessUnit;
        this.age = age;
    }

    public Employee() {
    }
    public void printEmployee(){
        System.out.println("Employee details");
        System.out.println("-------------------");
        System.out.println("Employee ID : "+ getEmployeeId());
        System.out.println("Employee Name :  "+ getEmployeeName());
        System.out.println("Employee Salary : "+ getSalary());
        System.out.println("Employee BU : "+ getBusinessUnit());
        System.out.println("Employee Age : "+ getAge());
    }
}
