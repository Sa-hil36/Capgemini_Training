package com.cg.service;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public List<EmployeeDTO> getAllEmployee();
    public EmployeeDTO createEmployee(Employee emp);
    public EmployeeDTO getEmployee(int empid);
    public String removeEmployee(int empid);
    public Employee updateEmployee(Employee e);
    public List<EmployeeDTO> getEmployeeByName(String name);
}
