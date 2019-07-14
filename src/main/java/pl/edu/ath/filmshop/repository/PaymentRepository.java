package pl.edu.ath.filmshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.filmshop.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String > {

    @Query("{'_id': ?0}")
    Payment findOneById(String id);
}
