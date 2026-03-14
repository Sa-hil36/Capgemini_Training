package org.annotation.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
    @Value("${empcity}")
    private String city;
    @Value("${empcountry}")
    private String country;
    @Value("${empzip}")
    private int zip;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String city, String country, int zip) {
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public Address() {
    }
}
