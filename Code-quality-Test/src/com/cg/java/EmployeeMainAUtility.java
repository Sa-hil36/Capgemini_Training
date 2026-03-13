package com.cg.java;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        e.setName("Amit");
        e.setEmail("amit@gmail.com");
        System.out.println("EmployeeID"+ e.getEmpid());
        System.out.println("EmployeeName"+ e.getName());
        System.out.println("EmployeeEmail"+ e.getEmail());
    }
}
