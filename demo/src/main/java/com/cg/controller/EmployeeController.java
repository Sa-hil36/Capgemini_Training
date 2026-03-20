package com.cg.controller;

import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import com.cg.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping(produces = {"application/json","application/xml"})
    public List<EmployeeDTO> getAllEmployee(){
        return service.getAllEmployee();
    }
    @GetMapping("/{eid}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int eid){
        EmployeeDTO e = service.getEmployee(eid);
        return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
    }
    @GetMapping("/name/{name}")
    public List<EmployeeDTO> getEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }
    @PostMapping(consumes = {"application/xml", "application/json"})
    public EmployeeDTO createNewEmployee(@RequestBody @Valid EmployeeDTO emp){
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
