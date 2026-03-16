package com.cg.bean;

import com.cg.MyConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
    public static void main(String[] args) {
        //        BeanFactory ctx = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h = (HelloWorld) ctx.getBean("h");
//        System.out.println(h.sayHello());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee e = (Employee) ctx.getBean(Employee.class);
        e.printEmployeeInfo();


    }
}
