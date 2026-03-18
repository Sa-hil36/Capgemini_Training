package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepo repo;
    public List<Employee> getAllEmployee(){
        return repo.findAll();
    }

    @Override
    public Employee createEmployee(Employee emp) {
        repo.saveAndFlush(emp);
        return emp;
    }

    @Override
    public Optional<Employee> getEmployee(int empid) {
        return repo.findById(empid);
    }

    @Override
    public String removeEmployee(int empid) {
        repo.deleteById(empid);
        return "Employee Deleted";
    }

    @Override
    public Employee updateEmployee(Employee e) {
        if(getEmployee(e.getEmp_id())!=null) {
            return repo.saveAndFlush(e);
        }else {
            return null;
        }
    }

    public List<Employee> getEmployeeByName(String name){
        return repo.findByName(name);
    }


}
