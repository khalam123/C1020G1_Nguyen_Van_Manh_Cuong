package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject( "provinces", provinceService.findAll());
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView save(Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created");
        return modelAndView;
    }

    @GetMapping("/")
    public String list(@RequestParam("s") Optional<String> s, Model model, @PageableDefault(size = 5) Pageable pageable) {
        if (s.isPresent()) {
            model.addAttribute("customer", customerService.findAllByFirstNameContaining(s.get(), pageable));

        } else {
            model.addAttribute("customer", customerService.findAll(pageable));
            model.addAttribute("province", provinceService.findAll());
        }
        return "/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("provinces", provinceService.findAll());
            model.addAttribute("customer", customer);
            return "/edit";
        } else {
            return "/error";
        }
    }

    @PostMapping("/edit")
    public String update(Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customer", customer);
        model.addAttribute("message", "Customer updated");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
        }
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:/";
    }

}
