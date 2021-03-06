package com.deadduck.Project2MUSICAPP.controller;

import com.deadduck.Project2MUSICAPP.bean.User;
import com.deadduck.Project2MUSICAPP.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    
    @Autowired
    IUserService userService;

    @RequestMapping("/home")
    public String findUsers(Model model) {
        
        List<User> users = (List<User>) userService.findAll();
        model.addAttribute("users", users);
        return "home";
    }
    
    @RequestMapping("/loggedIn")
    public String findLoggedIn(Model model) {
        return "loggedIn";
    }
    
    @RequestMapping("/premium")
    public String findPremium(Model model) {
        return "premium";
    }
    
    
	}