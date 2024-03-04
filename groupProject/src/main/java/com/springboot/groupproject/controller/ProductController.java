package com.springboot.groupproject.controller;

import com.springboot.groupproject.Buyer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @RequestMapping("/info")
    public String confirmPurchase(){
        return "infoPage";
    }

    @RequestMapping("/form")
    public String userDetails(HttpServletRequest request, Model model){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        Buyer buyer = new Buyer(firstName, lastName, email);
        model.addAttribute("buyer", buyer);
    return "userDetails";
    }

    @RequestMapping("/payment")
    public String paymentMethod(){
        return "paymentPage";
    }

    @RequestMapping("/endPage")
    public String endPage(){
        return "endPage";
    }

}
