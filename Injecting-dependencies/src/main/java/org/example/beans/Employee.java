package org.example.beans;

public class Employee {
    private int ID;
    private String Name;
    private float Salary;
    private String BU;
    private int Age;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Employee(int ID, String name, float salary, String BU, int age) {
        this.ID = ID;
        Name = name;
        Salary = salary;
        this.BU = BU;
        Age = age;
    }

    public Employee() {
    }
}
