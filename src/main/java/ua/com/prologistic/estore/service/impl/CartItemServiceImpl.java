package ua.com.prologistic.estore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.prologistic.estore.dao.CartItemDao;
import ua.com.prologistic.estore.model.Cart;
import ua.com.prologistic.estore.model.CartItem;
import ua.com.prologistic.estore.service.CartItemService;

/**
 * Created by Andrew on 07.05.2016.
 */
@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);
    }
}
