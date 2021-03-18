package case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String viewHome(){
        return "home";
    }

    @GetMapping("/403")
    public String viewError(){
        return "403";
    }

    @GetMapping("/login")
    public String formLogin(){
        return "login";
    }

}
