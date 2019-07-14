package pl.edu.ath.filmshop.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.ath.filmshop.model.Payment;
import pl.edu.ath.filmshop.repository.PaymentRepository;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Override
    public Payment findOneById(String id) {
        return repository.findOneById(id);
    }

    @Override
    public void save(Payment payment) {
        repository.save(payment);
    }

    @Override
    public void update(Payment payment) {

    }

    @Override
    public void delete(Payment payment) {
        repository.delete(payment);
    }

    @Override
    public List<Payment> findAll() {
        return repository.findAll();
    }
}
