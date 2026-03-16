package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
    public class Employee {
        @Value("${empId}")
        private int empId;
        @Value("${name}")
        private String name;
        //    @Autowired
//    @Qualifier("getBean2")
        private Address address;

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Employee(Address address) {
            this.address = address;
        }

        //    public Employee() {
//    }
        public void printEmployeeInfo(){
            System.out.println("empId "+ empId);
            System.out.println("Name "+ name);
            System.out.println("City "+ address.getCity());
            System.out.println("Country "+ address.getCountry());
            System.out.println("zip "+ address.getZip());
        }
    }


