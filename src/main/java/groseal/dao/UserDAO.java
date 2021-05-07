package groseal.dao;

import groseal.models.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);

    User readUser(Long id);

    void updateUser(Long id, String name, int age);

    void deleteUser(Long id);

    List<User> getAllUser();
}
