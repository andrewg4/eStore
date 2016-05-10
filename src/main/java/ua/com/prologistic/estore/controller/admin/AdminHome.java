package ua.com.prologistic.estore.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.prologistic.estore.model.Customer;
import ua.com.prologistic.estore.model.Product;
import ua.com.prologistic.estore.service.CustomerService;
import ua.com.prologistic.estore.service.ProductService;

import java.util.List;

/**
 * Created by Andrew on 25.04.2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model) {
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productInventory";
    }

    @RequestMapping("/customers")
    public String customerManagement(Model model) {

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customers", customerList);
        return "customerManagement";

    }
}
