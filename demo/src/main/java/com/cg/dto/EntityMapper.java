package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
    public static Employee convertObjectToEntity(EmployeeDTO edto){
        return new Employee(edto.getFullName(),edto.getDateofbirth(),edto.getSalary());
    }
    public static EmployeeDTO convertEntityToDTO(Employee emp){
        return new EmployeeDTO( emp.getName(), emp.getDob(), emp.getSalary());
    }
}
