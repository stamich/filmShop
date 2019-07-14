package pl.edu.ath.filmshop.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.ath.filmshop.model.Cart;
import pl.edu.ath.filmshop.repository.CartRepository;

public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository repository;

    @Override
    public Cart findOneById(String id) {
        return repository.findOneById(id);
    }

    @Override
    public void save(Cart cart) {
        repository.save(cart);
    }

    @Override
    public void update(Cart cart) {
        Cart entity = repository.findOneById(cart.getId());
        if (entity != null){
            entity.setFilms(cart.getFilms());
//            entity.setTotalCost(cart.getTotalCost());
        }
//        repository.save(cart);
    }

    @Override
    public void delete(Cart cart) {
        repository.delete(cart);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
