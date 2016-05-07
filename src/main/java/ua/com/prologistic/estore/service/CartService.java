package ua.com.prologistic.estore.service;

import ua.com.prologistic.estore.model.Cart;

/**
 * Created by Andrew on 07.05.2016.
 */
public interface CartService {
    Cart getCartById(int id);

    void update(Cart cart);
}
