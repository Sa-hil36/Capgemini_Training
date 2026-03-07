package com.cg.dao;

import com.cg.Entity.Author;
import com.cg.Entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Dao {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
    static EntityManager em = emf.createEntityManager();
    public Author InsertAuthor(Author a , List<Book> b){
        em.getTransaction().begin();
        for(Book i:b){
            i.setAuthor(a);
        }
        a.setBooks(b);
        em.persist(a);
        em.getTransaction().commit();
        return a;
    }

    public void fetchAuthor(){
        List<Author> authors = em.createQuery("from Author", Author.class).getResultList();
        for(Author a: authors) {
            System.out.println("Author Id : " + a.getAuthorId());
            System.out.println("Author Name : " + a.getAuthorName());
            System.out.println();
            System.out.println("Books Written:");
            System.out.println("------------------------");
            for (Book b : a.getBooks()) {
                System.out.println(b.getTitle() + " - " + b.getPrice());
            }
        }
    }
    public void updatePrice(int bookId, String newPrice){
        em.getTransaction().begin();
        Book b = em.find(Book.class, bookId);
        b.setPrice(newPrice);
        em.persist(b);
        em.getTransaction().commit();
    }
    public void deleteBook(int bookId){
        em.getTransaction().begin();
        Book b = em.find(Book.class, bookId);
        em.remove(b);
        em.getTransaction().commit();
    }
    public void deleteAuthor(int authorId){
        em.getTransaction().begin();
        Author a = em.find(Author.class, authorId);
        if(a != null){
            em.remove(a);
        }
        em.getTransaction().commit();
    }
}
