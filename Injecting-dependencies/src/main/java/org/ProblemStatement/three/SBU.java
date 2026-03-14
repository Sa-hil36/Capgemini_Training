package org.ProblemStatement.three;

import java.util.List;

public class SBU {

    private int sbuId;
    private String sbuName;
    private String sbuHead;
    private List<Employee> empList;

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void displaySBUDetails() {

        System.out.println("SBU ID : " + sbuId);
        System.out.println("SBU Name : " + sbuName);
        System.out.println("SBU Head : " + sbuHead);

        System.out.println("Employees List:");

        for(Employee e : empList) {
            System.out.println("Employee ID : " + e.getEmpId());
            System.out.println("Employee Name : " + e.getEmpName());
            System.out.println("Employee Salary : " + e.getSalary());
            System.out.println("----------------------");
        }
    }
}
