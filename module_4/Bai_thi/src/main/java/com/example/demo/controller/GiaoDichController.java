package com.example.demo.controller;

import com.example.demo.model.GiaoDich;
import com.example.demo.service.GiaoDichService;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class GiaoDichController {
    @Autowired
    private GiaoDichService giaoDichService;
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/")
    public String viewHome(){
        return "home";
    }

    @GetMapping("/list_gd")
    public String listGiaoDich(Model model, @PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("giao_dich",giaoDichService.findAll(pageable));
        return "list_giao_dich";
    }

    @GetMapping("/view_gd/{id}")
    public String viewGiaoDich(@PathVariable Integer id, Model model){
        GiaoDich giaoDich = giaoDichService.findById(id);
        model.addAttribute("giao_dich",giaoDich);
        return "view_giao_dich";
    }

    @GetMapping("/create_gd")
    public String taoMoiGD(Model model){
        GiaoDich giaoDich = new GiaoDich();
        model.addAttribute("giao_dich", giaoDich);
        model.addAttribute("khach_hang",khachHangService.findAll());
        return "create_giao_dich";
    }

    @PostMapping("/create_gd")
    public String taoMoiGD(@Valid GiaoDich giaoDich, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("khach_hang", khachHangService.findAll());
            return "create_giao_dich";
        } else {
            giaoDichService.save(giaoDich);
            model.addAttribute("giao-dich", giaoDichService.findAll());
            return "redirect:/list_gd";
        }
    }



    @PostMapping("/delete_gd")
    public String xoaGD(@RequestParam("delete_modal") int id){
        giaoDichService.remove(id);
        return "redirect:/list_gd";
    }

    @GetMapping("/tim_kiem")
    public String index(Model model, @PageableDefault (size = 5) Pageable pageable, @RequestParam("keyword") Optional<String> keyword){
        Page<GiaoDich> giaoDicheList;
        if (keyword.isPresent()){
            giaoDicheList = giaoDichService.findAllInputText(keyword.get() ,pageable) ;
        } else {
            giaoDicheList = giaoDichService.findAll(pageable) ;
        }
        model.addAttribute("giao_dich", giaoDicheList);
        return "/list_giao_dich";
    }
}
