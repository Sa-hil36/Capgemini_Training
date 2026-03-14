package org.ProblemStatement.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main{
        public static void main(String[] args) {

            ApplicationContext context =
                    new ClassPathXmlApplicationContext("bean4.xml");

            EmployeeService service =
                    (EmployeeService) context.getBean("empService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Employee ID : ");
            int id = sc.nextInt();

            service.displayEmployee(id);
        }
    }

