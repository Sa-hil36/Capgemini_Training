package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller
public class HelloController {
//    @GetMapping("hello")
//    public @ResponseBody sayHello(){
//        return "Hello World";
//    }
//    @GetMapping("abc")
//    public String sayHello1(){
//        return "Hello World 32";
//    }
//    @GetMapping("abc/{name}")
//    public String sayHello( String name){
//        return "Hello "+name;
//    }
@GetMapping("abc/{name}")
public String sayHello( @PathVariable String name){
    return "Hello "+name;
}
}
