package com.labs;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public static double calculateAverageSalary() {
        return EmployeeRepository.getEmployees().stream().map(e -> e.getSalary()).collect(Collectors.averagingDouble(e -> e));
    }


    public static Map<String, Optional<Employee>> getMaxSalaryByDepartment() {
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))));
    }


    public static Map<String, Double> getTotalSalaryByDepartment() {
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.summingDouble(e -> e.getSalary())));
    }


    public static void displayNameAndSalary() {
        EmployeeRepository.getEmployees().forEach(e -> System.out.println(e.getFirstName() + " : " + e.getSalary()));
    }


    public static List<Employee> sortBySalaryDesc() {
        return EmployeeRepository.getEmployees().stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
    }
}
