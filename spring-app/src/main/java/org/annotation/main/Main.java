package org.annotation.main;

import com.cg.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld h1 = (HelloWorld) ctx.getBean("hello");
        System.out.println(h1.sayHello());
        System.out.println("=====Language======");
        System.out.println(h1.getLanguage());

    }

}
