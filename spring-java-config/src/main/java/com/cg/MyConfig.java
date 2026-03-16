package com.cg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com")
public class MyConfig {
//    @Bean
//    @Scope("prototype")
//    public HelloWorld getBean(){
//        HelloWorld hello = new HelloWorld();
//        hello.setName("Guddu");
//        return hello;
//    }
//
//    @Bean
//    public Employee getBean1(){
//        return new Employee();
//    }
//
//    @Bean
//    public Address getBean2(){
//        return new Address();
//    }

}
