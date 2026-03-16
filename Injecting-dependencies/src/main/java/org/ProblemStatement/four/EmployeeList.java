package org.ProblemStatement.four;

import java.util.List;

public class EmployeeList {
    private List<Employee> empList;

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void displayEmployee(int id) {

        for(Employee e : empList) {
            if(e.getEmpId() == id) {

                System.out.println("Employee Info:");
                System.out.println("Employee ID : " + e.getEmpId());
                System.out.println("Employee NAME : " + e.getEmpName());
                System.out.println("Employee SALARY : " + e.getSalary());
            }
        }
    }
}
