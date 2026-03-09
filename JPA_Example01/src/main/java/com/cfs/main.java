package com.cfs;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.PipedWriter;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        PEmployee obj = new PEmployee();
        obj.setName("Priya");
        obj.setDob(LocalDate.of(2003,12,22));
        obj.setSalary(45000);
        em.persist(obj);
        em.getTransaction().commit();
        System.out.println("Created......");
    }

}
