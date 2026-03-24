package com.cg.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class EmployeeDTO {
    private int EmployeeId;
    @NotNull(message = "Name is required")
    @NotBlank(message = "Enter Valid name")
    private String fullName;
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private LocalDate dateofbirth;
    @NotNull(message = "Salary is required")
    @Min(value = 10000)
    private Double salary;

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }


    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeDTO( String fullName, LocalDate dateofbirth, Double salary) {
        this.fullName = fullName;
        this.dateofbirth = dateofbirth;
        this.salary = salary;
    }

    public EmployeeDTO() {
    }
}
