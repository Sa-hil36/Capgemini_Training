package com.cg.service;

import com.cg.Employee;
import com.cg.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;
    public String createEmployee(Employee emp){
        erepo.saveAndFlush(emp);
        return "Employee Created! Your EmpId = "+ emp.getEmpId();
    }
    public List<Employee> getAllEmployee(){
        return erepo.findAll();
    }
    public Employee getEmployee(int id) {
//        return erepo.findById(id).orElse(null);
        Optional<Employee> op = erepo.findById(id);
        if(op.isPresent()){
            return op.get();
        }else {
            return null;
        }
    }

    public String removeEmployee(int empid){
        if(getEmployee(empid)!=null){
            erepo.deleteById(empid);
            return "Employee Removed";
        }else {
            return "Employee not found";
        }
    }
    public String updateEmployee(Employee e){
//        Employee et = erepo.findById(e.getEmpId()).orElse(null);
//        et.setEmpId(e.getEmpId());
//        et.setName(e.getName());
//        et.setDob(e.getDob());
//        et.setSalary(e.getSalary());
//        erepo.delete(e);
//        erepo.save(et);
//        return "Employee updated";

        erepo.saveAndFlush(e);
        return "updated....";
    }
    public List<Employee> getEmployeeByName(String name){
        return erepo.findByNa(name);
    }
    public List<Employee> getEmployeeBysal(double sal){
        return erepo.findBySalaryLessThan(sal);
    }
}
