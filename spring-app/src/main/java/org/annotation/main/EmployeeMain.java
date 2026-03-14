package org.annotation.main;

import org.annotation.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Employee e = (Employee) ctx.getBean("emp");
        e.printEmployeeDetails();
    }
}
