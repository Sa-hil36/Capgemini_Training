package com.cg.service;

import com.cg.Entity.Author;
import com.cg.Entity.Book;
import com.cg.dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public Author intsert(Author a, List<Book> b){
        Dao d = new Dao();
        d.InsertAuthor(a, b);

        return a;
    }
    Dao d = new Dao();

}
