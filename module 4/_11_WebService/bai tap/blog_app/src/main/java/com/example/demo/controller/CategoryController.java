package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> listAllCategory() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/view-category/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> viewCategory(@PathVariable int id){
        Category category = categoryService.findById(id);
        if (category==null){
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Category>(category,HttpStatus.OK);
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<List<Blog>> detail(@PathVariable int id) {
        Category category = categoryService.findById(id);
        List<Blog> blogs = category.getBlogs();
        if (category == null) {
            return new ResponseEntity<List<Blog>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
        }
    }

//    @GetMapping("/category")
//    public String listCategory(Model model){
//        Iterable<Category> categories = categoryService.findAll();
//        model.addAttribute("category",categories);
//        return "/views/categoryList";
//    }
//    @GetMapping("/create-category")
//    public String showCategory(Model model){
//        model.addAttribute("categories",new Category());
//        return "/views/categoryCreate";
//    }
//    @PostMapping("/create-category")
//    public String saveCategory(Category category){
//        categoryService.save(category);
//        return "redirect:/category";
//    }
//    @GetMapping("/edit-category/{id}")
//    public String showEditForm(Model model,@PathVariable int id){
//        Category category = categoryService.findById(id);
//        model.addAttribute("categories",category);
//        return "/views/categoryEdit";
//    }
//    @PostMapping("/edit-category")
//    public String updateCategory(Category category){
//        categoryService.save(category);
//        return "redirect:/category";
//    }
//
//    @GetMapping("/delete-category/{id}")
//    public String showDeteleCategory(Model model, @PathVariable int id){
//        Category category = categoryService.findById(id);
//        model.addAttribute("categories",category);
//        return "/views/categoryDelete";
//    }
//    @PostMapping("/delete-category")
//    public String removeCategory(Category category){
//        categoryService.remove(category.getId());
//        return "redirect:/category";
//    }
//
//    @GetMapping("/view-category/{id}")
//    public ModelAndView viewCategory(ModelAndView modelAndView,@PathVariable int id){
//        return new ModelAndView("/views/categoryView","categories",categoryService.findById(id));
//    }

}
