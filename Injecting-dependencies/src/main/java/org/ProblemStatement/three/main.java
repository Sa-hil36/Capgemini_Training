package org.ProblemStatement.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        SBU s = (SBU) context.getBean("sbu");

        s.displaySBUDetails();
    }
}
