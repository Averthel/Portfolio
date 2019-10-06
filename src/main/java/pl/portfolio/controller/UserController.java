package pl.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.portfolio.user.UserRepository;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
