package com.cg;

import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SprinngDataAppApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SprinngDataAppApplication.class, args);
		EmployeeService es = ctx.getBean(EmployeeService.class);
		//es.createEmployee(new Employee("shubhi", LocalDate.of(2002,5,13),5000));
//		System.out.println(es.createEmployee(new Employee("Priya",LocalDate.of(2002,6,22),22000)));
//		System.out.println(es.createEmployee(new Employee("Anand",LocalDate.of(2002,6,21),67000)));
//		System.out.println(es.createEmployee(new Employee("Vinay",LocalDate.of(2002,6,25),57000)));
//		System.out.println(es.createEmployee(new Employee("Naina",LocalDate.of(2002,6,14),37000)));
//		System.out.println(es.createEmployee(new Employee("Vinay",LocalDate.of(2002,6,3),85000)));
//		es.getAllEmployee().forEach(e-> System.out.println(e));
//		System.out.println("Employee created");
//		Employee e = es.getEmployee(52);
//		if(e!=null){
//			e.setDob(LocalDate.of(2002,6,3));
//			System.out.println(es.updateEmployee(e));
//		}else {
//			System.out.println("Employee not found");
//		}
		//es.getEmployeeByName("vinay").forEach(e-> System.out.println(e));
		es.getEmployeeBysal(2200).forEach(e-> System.out.println(e));
	}

}
