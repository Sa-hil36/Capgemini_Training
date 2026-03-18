package com.cg.controller;

import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping("/")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }
    @GetMapping("/{eid}")
    public Optional<Employee> getEmployee(@PathVariable int eid){
        return service.getEmployee(eid);
    }
    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }
    @PostMapping("/")
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }
    @DeleteMapping("/delete/{empid}")
    public String deleteEmp(@PathVariable int empid){
        service.removeEmployee(empid);
        return "Deleted";
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee e){
        return service.updateEmployee(e);
    }
}
