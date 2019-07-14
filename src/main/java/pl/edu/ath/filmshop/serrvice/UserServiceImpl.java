package pl.edu.ath.filmshop.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.ath.filmshop.model.User;
import pl.edu.ath.filmshop.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public User findOneById(String id) {
        return repository.findOneById(id);
    }

    @Override
    public User findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    public void save(User user){
        repository.save(user);
    }

    public void update(User user){
        User entity = repository.findOneById(user.getId());
        if (entity!=null){
            entity.setFirstName(user.getFirstName());
            entity.setLastName(user.getLastName());
            entity.setEmail(user.getEmail());
            entity.setPhone(user.getPhone());
            entity.setTypes(user.getTypes());
        }
//        repository.save(user);
    }

    public void delete(User user){
        repository.delete(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}

