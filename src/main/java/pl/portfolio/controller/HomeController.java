package pl.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home1() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
