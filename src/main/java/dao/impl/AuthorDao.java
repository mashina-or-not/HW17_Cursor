package dao.impl;

import dao.LibraryDao;
import model.Author;
import model.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorDao implements LibraryDao<Author> {
    @Override
    public void create(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(author);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Author> getAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createQuery("From Author", Author.class).list();
    }

    @Override
    public Author getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .get(Author.class, id);
    }
}
