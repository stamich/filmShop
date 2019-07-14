package pl.edu.ath.filmshop.serrvice;

import pl.edu.ath.filmshop.model.Payment;

import java.util.List;

public interface PaymentService {

    Payment findOneById(String id);
    void save(Payment payment);
    void update(Payment payment);
    void delete(Payment payment);
    List<Payment> findAll();
}
