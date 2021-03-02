package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/views/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView save(Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/views/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("message","New customer created");
        return modelAndView;
    }

    @GetMapping("/")
    public ModelAndView list(){
//        List<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/list");
//        modelAndView.addObject("customer",customers);
        return new ModelAndView("/views/list","customer",customerService.findAll());
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        if (customer!=null){
            model.addAttribute("customer",customer);
            return "/views/edit";
        }else {
            return "/views/error";
        }
    }
    @PostMapping("/edit")
    public String update(Customer customer, Model model){
        customerService.save(customer);
        model.addAttribute("customer",customer);
        model.addAttribute("message","Customer updated");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        if (customer!=null){
            model.addAttribute("customer",customer);
            return "/views/delete";
        }else {
            return "/views/delete";
        }
    }
    @PostMapping("/delete")
    public String delete(Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/";
    }
}
