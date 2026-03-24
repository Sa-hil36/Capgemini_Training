package com.cg.service;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public List<EmployeeDTO> getAllEmployee();
    public EmployeeDTO createEmployee(EmployeeDTO emp);
    public EmployeeDTO getEmployee(int empid);
    public String removeEmployee(int empid);
    public EmployeeDTO updateEmployee(EmployeeDTO e);
    public List<EmployeeDTO> getEmployeeByName(String name);
}
