package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
    public static Employee convertObjectToEntity(EmployeeDTO edto){
        return new Employee(edto.getFullName(),edto.getDateofbirth(),edto.getSalary());
    }
    public static EmployeeDTO convertEntityToDTO(Employee emp){
        EmployeeDTO edto = new EmployeeDTO(emp.getName(), emp.getDob(), emp.getSalary());
        edto.setEmployeeId(emp.getEmp_id());
        return edto;

    }
}
