package ua.com.prologistic.estore.dao;

import org.springframework.stereotype.Repository;
import ua.com.prologistic.estore.model.Cart;

import java.io.IOException;

/**
 * Created by Andrew on 16.04.2016.
 */
@Repository
public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
