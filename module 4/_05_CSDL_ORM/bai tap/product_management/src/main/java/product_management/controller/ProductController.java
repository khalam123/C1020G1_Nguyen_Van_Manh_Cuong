package product_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import product_management.model.Product;
import product_management.service.ProductService;

@Controller

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping({"","/home"})
    public String home(Model model){
        model.addAttribute("list_product",this.productService.findAll());
        return "home";
    }

    @GetMapping("/view")
    public String viewProduct(@RequestParam Integer id,Model model){
        model.addAttribute("viewProduct",productService.findById(id));
        return "view";
    }

    @GetMapping("/view/{id}")
    public String viewStudentPathVariable(@PathVariable Integer id, Model model) {
        model.addAttribute("productView", productService.findById(id));
        return "view";
    }

    @GetMapping("/create")
    public String createProduct(Model model ){
        model.addAttribute("productObj",new Product());
        return "create";
    }

    @PostMapping("/create")
    public String productCreate(Model model, @ModelAttribute Product productObj, RedirectAttributes redirectAttributes){
        this.productService.save(productObj);
        redirectAttributes.addFlashAttribute("messageSuccess","Register successfully!");
        return  "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        model.addAttribute("productEdit",productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product){
        productService.update(product.getId(),product);
        return "redirect:/home";
    }

}
