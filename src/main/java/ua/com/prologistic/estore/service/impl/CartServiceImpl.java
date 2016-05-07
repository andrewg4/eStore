package ua.com.prologistic.estore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.prologistic.estore.dao.CartDao;
import ua.com.prologistic.estore.model.Cart;
import ua.com.prologistic.estore.service.CartService;

/**
 * Created by Andrew on 07.05.2016.
 */
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
