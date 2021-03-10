package com.example.demo.controller;

import com.example.demo.config.LogBook;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.BookLendNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookLendNumberService bookNumberService;

    @GetMapping("/")
    public String home(Model model, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "");
        model.addAttribute("books", bookService.findAll());
        return "list";
    }

    @GetMapping("/create-book")
    public String showCreateForm(Model model){
        model.addAttribute("book", new Book());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        bookService.save(book);
        redirectAttributes.addFlashAttribute("message", "Create Complete !");
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewBook(ModelAndView modelAndView, @PathVariable int id){
        return new ModelAndView("/view","book",bookService.findById(id));
    }
//    @GetMapping("/view")
//    public String viewBlog(@RequestParam Integer id, Model model) {
//        model.addAttribute("book", bookService.findById(id));
//        return "view";
//    }

    @GetMapping("/borrow")
    public String borrow(@RequestParam Integer id, RedirectAttributes redirectAttributes) throws Exception {
        redirectAttributes.addFlashAttribute("message", "Borrow Complete ! your book number is " + bookService.borrow(id));
        LogBook.name = bookService.findById(id).getName();
        return "redirect:/";
    }

    @GetMapping("/give-back")
    public String showGiveBack(@RequestParam Integer id, Model model) {
        model.addAttribute("id", id);
        return "/give-back";
    }

    @PostMapping("/give-back")
    public String giveBack(@RequestParam Integer lendNumber, @RequestParam Integer idBook,
                           RedirectAttributes redirectAttributes) {
        String message = bookService.giveBack(lendNumber, idBook);
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException() {
        return "error-book";
    }
}
