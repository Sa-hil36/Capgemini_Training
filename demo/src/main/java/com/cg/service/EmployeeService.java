package com.cg.service;

import com.cg.Exception.EmployeeNotFoundException;
import com.cg.dto.EntityMapper;
import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepo repo;
    public List<EmployeeDTO> getAllEmployee(){
        List<Employee> emps = repo.findAll();
        List<EmployeeDTO> employers = new ArrayList<>();

        emps.forEach(e-> employers.add(EntityMapper.convertEntityToDTO(e)));
        return employers;
    }

    @Override
    public EmployeeDTO createEmployee(Employee emp) {
        repo.saveAndFlush(emp);
        return EntityMapper.convertEntityToDTO(emp);
    }

    @Override
    public EmployeeDTO getEmployee(int empid) {
        Optional<Employee> op = repo.findById(empid);
        if(op.isPresent()){
            return EntityMapper.convertEntityToDTO(op.get());
        }else {
            throw new EmployeeNotFoundException("Employee not Exist");
        }
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

    public List<EmployeeDTO> getEmployeeByName(String name){
        List<Employee> emps = repo.findByName(name);
        List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
        emps.forEach(e->employees.add(EntityMapper.convertEntityToDTO(e)));
        return employees;
    }


}
