package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import com.example.demo.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.time.LocalDate;

@Controller
//@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

//    @GetMapping("/")
//    public ResponseEntity<List<Blog>> listAllBlog(){
//        List<Blog> blogs = blogService.findAll();
//        if (blogs.isEmpty()){
//            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
//        }else {
//            return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
//        }
//    }
//    @GetMapping("/view/{id}")
//    public ResponseEntity<Blog> viewBlog(@PathVariable int id) {
//        Blog blog = blogService.findById(id);
//        if (blog == null) {
//            return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<Blog>(blog, HttpStatus.OK);
//        }
//    }
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
    public String list(Model model, @PageableDefault(size = 5, sort = "dateCreate") Pageable pageable){
//        if (s.isPresent()){
//            model.addAttribute("blog", blogService.findAllTextContaining(s.get(),pageable));
//        }else{
            model.addAttribute("blog",blogService.findAll(pageable));

        return "/views/list";
    }

    @GetMapping("/view/{id}")
    public String showViewForm(@PathVariable int id,Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blogs",blog);
        return "/views/view";
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

    @RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "/views/welcomePage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model, Principal principal) {

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "views/adminPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "views/loginPage";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "views/logoutSuccessfulPage";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "views/userInfoPage";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }
        return "views/403Page";
    }

}