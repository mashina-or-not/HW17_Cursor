package service;

import model.User;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
