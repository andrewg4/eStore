package ua.com.prologistic.estore.dao;

import org.springframework.stereotype.Repository;
import ua.com.prologistic.estore.model.Cart;

/**
 * Created by Andrew on 16.04.2016.
 */
@Repository
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
