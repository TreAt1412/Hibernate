package com.example.demo;

import com.example.demo.bean.Book;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Book book = new Book("Dvanh1");
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        SpringApplication.run(DemoApplication.class);
    }

}
