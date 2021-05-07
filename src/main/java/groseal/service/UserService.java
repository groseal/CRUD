package groseal.service;

import groseal.models.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    User readUser(Long id);

    void updateUser(Long id, String name, int age);

    void deleteUser(Long id);

    List<User> getAllUser();

}
