package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public String sayhello(String name){
        return "Hello "+name;
    }
}
