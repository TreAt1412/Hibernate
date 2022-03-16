package com.example.demo;

import com.example.demo.bean.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManageBook {
    private static SessionFactory factory;

    public static void main(String[] args) {
        factory = HibernateUtil.getSessionFactory();
        Integer result = addEmployee("Do Viet Anh");
    }
    public static Integer addEmployee(String fname) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer bookId = null;
        try {
            tx = session.beginTransaction();
            Book book = new Book(fname);
            bookId = (Integer) session.save(book);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return bookId;
    }
}
