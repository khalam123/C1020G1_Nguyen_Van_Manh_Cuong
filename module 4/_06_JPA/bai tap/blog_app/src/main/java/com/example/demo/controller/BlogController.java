package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/views/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView save(Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        modelAndView.addObject("blog",new Blog());
        modelAndView.addObject("message","New blog created");
        return modelAndView;
    }

    @GetMapping("/")
    public ModelAndView list(){
        return new ModelAndView("/views/list","blog",blogService.findAll());
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        if (blog!=null){
            model.addAttribute("blog",blog);
        }
        return "/views/edit";
    }
    @PostMapping("/edit")
    public String update(Blog blog, Model model){
        blogService.save(blog);
        model.addAttribute("blog",blog);
        model.addAttribute("message","Blog updated");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        if (blog!=null){
            model.addAttribute("blog",blog);
        }
        return "/views/delete";
    }
    @PostMapping("/delete")
    public String delete(Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/";
    }
}