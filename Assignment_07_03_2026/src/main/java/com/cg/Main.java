package com.cg;

import com.cg.Entity.Author;
import com.cg.Entity.Book;
import com.cg.dao.Dao;
import com.cg.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service s = new Service();
        Dao d = new Dao();
        boolean flag = true;
        while(flag) {
            System.out.println("1. Insert Author....");
            System.out.println("2. Fetch All Author....");
            System.out.println("3. Update Price.....");
            System.out.println("4. Delete Book.....");
            System.out.println("5. Delete Author.....");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter author name: ");
                    String name = sc.next();
                    System.out.println("Enter author email: ");
                    String email = sc.next();
                    List<Book> b = new ArrayList<>();
                    System.out.println("Number of book :");
                    int no = sc.nextInt();
                    while (no>0){
                        no--;
                        System.out.println("Enter Book name");
                        String bname = sc.next();
                        System.out.println("Enter Book Price");
                        String bPrice = sc.next();
                        Book b1 = new Book(bname, bPrice);
                        b.add(b1);
                    }
                    Author a = new Author(name, email);
                    s.intsert(a, b);
                    break;
                case 2:
                    System.out.println("Enter Author");
                    d.fetchAuthor();
                    break;

                case 3:
                    System.out.println("Enter Book Id");
                    int t = sc.nextInt();
                    System.out.println("Enter New Price");
                    String p = sc.next();
                    d.updatePrice(t, p);
                    break;

                case 4:
                    System.out.println("Enter Book Id to Delete");
                    int w = sc.nextInt();
                    d.deleteBook(w);
                    break;

                case 5:
                    System.out.println("Enter Author ID");
                    int id = sc.nextInt();
                    d.deleteAuthor(id);
                    break;

                case 6:
                    System.out.println("Exit...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }


    }
}
