package ua.com.prologistic.estore.service;

import ua.com.prologistic.estore.model.Customer;

import java.util.List;

/**
 * Created by Andrew on 26.04.2016.
 */
public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(Integer id);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
