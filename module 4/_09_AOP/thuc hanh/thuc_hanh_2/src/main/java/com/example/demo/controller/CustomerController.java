package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import com.example.demo.service.CustomerService;
import com.example.demo.service.DuplicateEmailException;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @ModelAttribute("provinces")
    public Iterable<Province> allProvinces() {
        return provinceService.findAll();
    }

    @GetMapping
    public ModelAndView showList(Optional<String> s, Pageable pageInfo) {
        ModelAndView modelAndView = new ModelAndView("/list");
        Page<Customer> customers = s.isPresent() ? search(s, pageInfo) : getPage(pageInfo);
        modelAndView.addObject("keyword", s.orElse(null));
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/info");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView updateCustomer(Customer customer) throws DuplicateEmailException {
        customerService.save(customer);
        return new ModelAndView("redirect:/");
    }
    @ExceptionHandler(DuplicateEmailException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("/inputs-not-acceptable");
    }


    private Page<Customer> getPage(Pageable pageInfo) {
        return customerService.findAll(pageInfo);
    }

    private Page<Customer> search(Optional<String> s, Pageable pageInfo) {
        return customerService.search(s.get(), pageInfo);
    }

    @GetMapping("/create-customer")
    public String createFormCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "/create";
    }
    @PostMapping("/create-customer")
    public String createCustomer(Customer customer) throws DuplicateEmailException {
        customerService.save(customer);
        return "redirect:/";
    }
}
