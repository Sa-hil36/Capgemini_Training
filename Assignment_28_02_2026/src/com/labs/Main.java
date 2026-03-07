package com.labs;

public class Main {

    public static void main(String[] args) {

        // Question 1:
        System.out.println("Average Salary: " + EmployeeService.calculateAverageSalary());

        // Question 2:
        System.out.println("Max Salary By Department:");
        System.out.println(EmployeeService.getMaxSalaryByDepartment());

        // Question 3:
        System.out.println("Total Salary By Department:");
        System.out.println(EmployeeService.getTotalSalaryByDepartment());

        // Question 4:
        System.out.println("Employee Name & Salary: ");
        EmployeeService.displayNameAndSalary();

        // Question 5:
        System.out.println("Sorted By Salary Desc:");
        EmployeeService.sortBySalaryDesc().forEach(System.out::println);
    }
}
