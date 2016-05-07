package ua.com.prologistic.estore.service;

import ua.com.prologistic.estore.model.CustomerOrder;

/**
 * Created by Andrew on 07.05.2016.
 */
public interface CustomerOrderService {
    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);


}
