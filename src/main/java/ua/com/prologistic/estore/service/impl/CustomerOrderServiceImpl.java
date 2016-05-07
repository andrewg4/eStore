package ua.com.prologistic.estore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.prologistic.estore.dao.CustomerOrderDao;
import ua.com.prologistic.estore.model.Cart;
import ua.com.prologistic.estore.model.CartItem;
import ua.com.prologistic.estore.model.CustomerOrder;
import ua.com.prologistic.estore.service.CartService;
import ua.com.prologistic.estore.service.CustomerOrderService;

import java.util.List;

/**
 * Created by Andrew on 07.05.2016.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }
}
