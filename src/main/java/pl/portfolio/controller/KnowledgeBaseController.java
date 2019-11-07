package pl.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KnowledgeBaseController {

    @GetMapping("/panel1")
    public String panel1(){
        return "/partials/panel1";
    }
}
