package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.servie.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public List<Product> createCart() {
        return new ArrayList<>();
    }

    @GetMapping("/buy/{id}")
    public String buyProduct(@SessionAttribute("cart") List<Product> productList, @PathVariable Integer id){
        productList.add(productService.findById(id));

        return "redirect:/";
    }

    @GetMapping("/cart")
    public String goToCart(@SessionAttribute("cart") List<Product> productList, Model model){
        model.addAttribute("carts",productList);
        return "cart";
    }
//
    @GetMapping("/")
    public ModelAndView listProduct(){
        return new ModelAndView("/list","products",productService.findAll());
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewProduct(@PathVariable Integer id){
        return new ModelAndView ("/view","product",productService.findById(id));
    }

    @GetMapping("/cart-delete/{id}")
    public String deleteProduct(@PathVariable Integer id, @SessionAttribute("cart") List<Product> productList,Model model){
        productService.deleteProduct(id,productList);
        model.addAttribute("carts", productList);
        return "redirect:/cart";
    }

    @GetMapping("/cart-delete-all/")
    public String deleteAllProduct(Model model,@SessionAttribute("cart") List<Product> productList){
        productList.clear();
        return "redirect:/cart";
    }

}