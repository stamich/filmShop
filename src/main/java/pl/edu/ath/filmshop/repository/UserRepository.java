package pl.edu.ath.filmshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.filmshop.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{'_id': ?0}")
    User findOneById(String id);

    @Query("{'firstName' : ?0}")
    User findByFirstName(String firstName);

    @Query("{'firstName' : ?0, 'lastName' : ?1}")
    User findByFirstNameAndLastName(String firstName, String lastName);
}