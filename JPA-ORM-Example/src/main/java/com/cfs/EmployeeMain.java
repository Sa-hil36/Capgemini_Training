package com.cfs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Employee> root = cq.from(Employee.class);

        cq.multiselect(root.get("dept"), cb.count(root));
        cq.groupBy(root.get("dept"));
        TypedQuery<Object[]> tq = em.createQuery(cq);
        List<Object[]> list = em.createQuery(cq).getResultList();

        list.forEach(o -> System.out.println(o[0]+" "+o[1]));

    }
}

