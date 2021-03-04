package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("users",new User());
        return "login";
    }
    @PostMapping("/")
    public String checkValidation (@Valid @ModelAttribute("users")User user, BindingResult bindingResult, Model model){
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "login";
        }
        else {
            model.addAttribute("user", user.getFirstName());
            model.addAttribute("user", user.getLastName());
            model.addAttribute("user", user.getPhoneNumber());
            model.addAttribute("user", user.getAge());
            model.addAttribute("user", user.getEmail());
            return "result";
        }
    }
}
