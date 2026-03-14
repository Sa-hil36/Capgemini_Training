package com.cg.java;

/*
        *
        * @author Jon Doe
*/
public class EmployeeMainAUtility {
    /*
     *
     * @author Jon Doe
     */
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpid(101);
        employee.setName("Amit");
        employee.setEmail("amit@gmail.com");
        System.out.println("EmployeeID"+ employee.getEmpid());
        System.out.println("EmployeeName"+ employee.getName());
        System.out.println("EmployeeEmail"+ employee.getEmail());
    }
}
