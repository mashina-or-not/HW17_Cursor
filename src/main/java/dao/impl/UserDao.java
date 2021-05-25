package dao.impl;

import dao.LibraryDao;
import model.HibernateSessionFactoryUtil;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao implements LibraryDao<User> {

    @Override
    public void create(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    @Override
    public List<User> getAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createQuery("From User", User.class).list();
    }

    @Override
    public User getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .get(User.class, id);
    }
}
