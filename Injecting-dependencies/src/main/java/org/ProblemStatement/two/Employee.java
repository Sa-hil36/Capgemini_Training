package org.ProblemStatement.two;

public class Employee {
    private int employeeId;
    private String employeeName;
    private float salary;
    private SBU businessUnit;
    private int age;

    public SBU getSUBDetails(){
        return businessUnit;
    }
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

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit){
        this.businessUnit = businessUnit;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int employeeId, String employeeName, float salary, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }
    public void printEmployee(){
        System.out.println("Employee details");
        System.out.println("-------------------");
        System.out.print("Employee [empAge="+getAge()+", empName="+getEmployeeName()+", empSalary="+getSalary()+"sub details=SBU [subCode="+businessUnit.getSbuId()+", subHead="+businessUnit.getSbuHead()+", subName="+businessUnit.getSbuName()+"]]");
    }
}
