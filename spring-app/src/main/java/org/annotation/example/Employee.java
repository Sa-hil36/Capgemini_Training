package org.annotation.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
    @Value("${id}")
    private int empid;
    @Value("${empname}")
    private String name;
    @Autowired
    @Qualifier("add")
    private Address address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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
    public void printEmployeeDetails(){
        System.out.println("Employee ID:" + empid);
        System.out.println("Employee name: " + name);
        System.out.println("=====Address======");
        System.out.println("City: "+ address.getCity());
        System.out.println("Country: "+ address.getCountry());
        System.out.println("zip: "+ address.getZip());
    }
}
