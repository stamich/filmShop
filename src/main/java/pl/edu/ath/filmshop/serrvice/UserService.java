package pl.edu.ath.filmshop.serrvice;

import pl.edu.ath.filmshop.model.User;

import java.util.List;

public interface UserService {

    User findOneById(String id);
    User findByFirstName(String firstName);
    void save(User user);
    void update(User user);
    void delete(User user);
    List<User> findAll();
}
