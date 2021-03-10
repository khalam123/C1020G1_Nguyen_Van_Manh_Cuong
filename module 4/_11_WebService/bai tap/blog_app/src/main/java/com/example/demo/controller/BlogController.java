package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/views/create");
        modelAndView.addObject("categories",categoryService.findAll());
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView save(Blog blog){
        blog.setDateCreate(LocalDate.now());
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        modelAndView.addObject("blog",new Blog());
        modelAndView.addObject("message","New blog created");
        return modelAndView;
    }

    @GetMapping("/")
    public String list(@RequestParam("s") Optional<String> s, Model model, @PageableDefault(size = 5, sort = "dateCreate") Pageable pageable){
        if (s.isPresent()){
            model.addAttribute("blog", blogService.findAllTextContaining(s.get(),pageable));
        }else{
            model.addAttribute("blog",blogService.findAll(pageable));
        }
        return "/views/list";
    }



    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        if (blog!=null){
            model.addAttribute("categories",categoryService.findAll());
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