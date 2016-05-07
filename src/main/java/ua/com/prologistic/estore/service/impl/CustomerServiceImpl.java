package ua.com.prologistic.estore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.prologistic.estore.dao.CustomerDao;
import ua.com.prologistic.estore.model.Customer;
import ua.com.prologistic.estore.service.CustomerService;

import java.util.List;

/**
 * Created by Andrew on 26.04.2016.
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById(Integer id) {
        return customerDao.getCustomerById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerByUsername(String username) {
        return customerDao.getCustomerByUsername(username);
    }
}
