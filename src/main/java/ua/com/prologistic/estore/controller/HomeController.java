package ua.com.prologistic.estore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrew on 03.04.2016.
 */
@Controller
public class HomeController {
 
    @RequestMapping("/")
    public String home() {
        return "home";
    }


}
