package com.cg.controller;

import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import com.cg.entity.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "EmployeeAPI", description = "This provide the CRUD operation with Employee Entity")
public class EmployeeController {


    @Autowired
    private IEmployeeService service;


    @GetMapping(produces = {"application/json","application/xml"})
    @Operation(summary = "This API will provide all employee details from MySQL DB")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(){
        List<EmployeeDTO> list = service.getAllEmployee();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping("/{eid}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int eid){
        EmployeeDTO e = service.getEmployee(eid);
        return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
    }


    @GetMapping("/name/{name}")
    public ResponseEntity<List<EmployeeDTO>> getEmployeeByName(@PathVariable String name){
        List<EmployeeDTO>  list = service.getEmployeeByName(name);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


    @PostMapping(consumes = {"application/xml", "application/json"})
    public ResponseEntity<EmployeeDTO> createNewEmployee(@RequestBody @Valid EmployeeDTO emp){
        return new ResponseEntity<>(service.createEmployee(emp),HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{empid}")
    public ResponseEntity deleteEmp(@PathVariable int empid){
        service.removeEmployee(empid);
        return new ResponseEntity("Deleted",HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO e){
        return new ResponseEntity<>(service.updateEmployee(e),HttpStatus.OK);
    }
}
