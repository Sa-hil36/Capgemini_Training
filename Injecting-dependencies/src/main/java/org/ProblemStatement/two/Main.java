package org.ProblemStatement.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
        Employee em = (Employee) ctx.getBean("emp");
        em.printEmployee();
    }
}
