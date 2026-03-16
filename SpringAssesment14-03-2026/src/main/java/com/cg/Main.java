package com.cg;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Librarian librarian = (Librarian) ctx.getBean("librarian");
        librarian.issueBook();
    }
}
