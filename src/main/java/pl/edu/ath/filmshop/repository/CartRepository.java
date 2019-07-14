package pl.edu.ath.filmshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.filmshop.model.Cart;
import pl.edu.ath.filmshop.model.User;

public interface CartRepository extends MongoRepository<Cart, String> {

    @Query("{'_id': ?0}")
    User findOneById(String id);
}
