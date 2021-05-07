package groseal.service;

import groseal.dao.UserDAO;
import groseal.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User readUser(Long id) {
        return userDAO.readUser(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, String name, int age) {
        userDAO.updateUser(id, name, age);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }
}
