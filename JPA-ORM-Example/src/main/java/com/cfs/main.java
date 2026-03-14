package com.cfs;

import jakarta.persistence.*;

import java.util.List;

public class main {
   // public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        TypedQuery<Product> q = em.createQuery("select p from Product p", Product.class);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p.getName()+","+p.getPrice()+","+p.getMfd()));

//        TypedQuery<Object[]> q = em.createQuery("select p.name, p.price, p.mfd from Product p", Object[].class);
//        List<Object[]> li = q.getResultList();
//        li.forEach(p -> System.out.println(p[0]+"\t"+p[1]+"\t"+p[2]));

//        TypedQuery<ProductDto> q = em.createQuery("select new ProductDto(p.name, p.price, p.mfd) from Product p", ProductDto.class);
//        List<ProductDto> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price < :p", Product.class);
//        q.setParameter("p", 5000);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.name like :p", Product.class);
//        q.setParameter("p", "L%");
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

//        em.getTransaction().begin();
//        Query q = em.createQuery("update Product p set p.price = 65000 where p.pid = 3");
//        int row = q.executeUpdate();
//        em.getTransaction().commit();
//        System.out.println("Updated -> "+ row);
        

    }

//}
