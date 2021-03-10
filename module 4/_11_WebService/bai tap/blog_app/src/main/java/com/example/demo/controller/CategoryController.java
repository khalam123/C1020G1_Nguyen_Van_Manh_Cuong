package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String listCategory(Model model){
        Iterable<Category> categories = categoryService.findAll();
        model.addAttribute("category",categories);
        return "/views/categoryList";
    }
    @GetMapping("/create-category")
    public String showCategory(Model model){
        model.addAttribute("categories",new Category());
        return "/views/categoryCreate";
    }
    @PostMapping("/create-category")
    public String saveCategory(Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/edit-category/{id}")
    public String showEditForm(Model model,@PathVariable int id){
        Category category = categoryService.findById(id);
        model.addAttribute("categories",category);
        return "/views/categoryEdit";
    }
    @PostMapping("/edit-category")
    public String updateCategory(Category category){
        categoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping("/delete-category/{id}")
    public String showDeteleCategory(Model model, @PathVariable int id){
        Category category = categoryService.findById(id);
        model.addAttribute("categories",category);
        return "/views/categoryDelete";
    }
    @PostMapping("/delete-category")
    public String removeCategory(Category category){
        categoryService.remove(category.getId());
        return "redirect:/category";
    }

    @GetMapping("/view-category/{id}")
    public ModelAndView viewCategory(ModelAndView modelAndView,@PathVariable int id){
        return new ModelAndView("/views/categoryView","categories",categoryService.findById(id));
    }

}
