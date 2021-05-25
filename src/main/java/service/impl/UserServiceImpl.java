package service.impl;

import dao.impl.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.create(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
