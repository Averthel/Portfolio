package pl.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.portfolio.user.User;
import pl.portfolio.user.UserRepository;


@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/registerUser")
    public String addUser(@RequestParam String username, @RequestParam String password, @RequestParam String email, Model model, RedirectAttributes redirectAttr) {
        User user = new User(username, password, email);
        System.out.println(username);
        try {
            userRepository.save(user);
        } catch (Exception e) {

        }
        return "index";
    }


}
