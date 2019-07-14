package pl.edu.ath.filmshop.serrvice;

import pl.edu.ath.filmshop.model.Cart;

public interface CartService {

    Cart findOneById(String id);
    void save(Cart cart);
    void update(Cart cart);
    void delete(Cart cart);
    void deleteById(String id);
}
