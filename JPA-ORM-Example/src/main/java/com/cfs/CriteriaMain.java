package com.cfs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> r = cq.from(Product.class);
        //Predicate con1 = cb.greaterThan(r.get("price"),50000);
        //cq.select(r).where(cb.lessThan(r.get("price"), 45000));
        cq.select(r).where(cb.like(r.get("name") ,"I%"));

        List<Product> li = em.createQuery(cq).getResultList();
        li.forEach(p-> System.out.println(p));



















































    }
}
