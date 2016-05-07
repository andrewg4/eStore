package ua.com.prologistic.estore.service;

import ua.com.prologistic.estore.model.Cart;
import ua.com.prologistic.estore.model.CartItem;

/**
 * Created by Andrew on 07.05.2016.
 */
public interface CartItemService {
    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
