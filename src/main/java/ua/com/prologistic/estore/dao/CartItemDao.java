package ua.com.prologistic.estore.dao;

import ua.com.prologistic.estore.model.Cart;
import ua.com.prologistic.estore.model.CartItem;

/**
 * Created by Andrew on 07.05.2016.
 */
public interface CartItemDao {
    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);
}
