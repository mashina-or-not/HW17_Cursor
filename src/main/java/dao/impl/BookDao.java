package dao.impl;

import dao.LibraryDao;
import model.Book;
import model.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDao implements LibraryDao<Book> {
    @Override
    public void create(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Book> getAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createQuery("From Book", Book.class).list();
    }

    @Override
    public Book getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .get(Book.class, id);
    }
}
