package ua.com.prologistic.estore.dao;

import ua.com.prologistic.estore.model.Product;

import java.util.List;

/**
 * Created by Andrew on 04.04.2016.
 */

public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
