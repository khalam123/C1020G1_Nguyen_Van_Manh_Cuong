package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import com.example.demo.service.ProvinceService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProviceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/province")
    public String listProvince(Model model){
        Iterable<Province> provinces = provinceService.findAll();
        model.addAttribute("province",provinces);
        return "/provinceList";
    }
    @GetMapping("/create-province")
    public String showCreateForm(Model model){
        model.addAttribute("province",new Province());
        return "/provinceCreate";
    }
    @PostMapping("/create-province")
    public String saveProvince(Model model,Province province){
        provinceService.save(province);
        model.addAttribute("province",province);
        return "redirect:/province";
    }

    @GetMapping("/edit-province/{id}")
    public String showEditForm(@PathVariable int id,Model model){
        Province province = provinceService.findById(id);
        if(province != null) {
            model.addAttribute("province", province);
        }
        return "/provinceEdit";
    }

    @PostMapping("/edit-province")
    public String updateProvince( Province province,Model model){
        provinceService.save(province);
        model.addAttribute("province",province);

        return "redirect:/province";
    }

    @GetMapping("/delete-province/{id}")
    public String showDeleteForm(@PathVariable int id,Model model){
        Province province = provinceService.findById(id);
        if(province != null) {
            model.addAttribute("province", province);
        }
        return "/provinceDelete";
    }

    @PostMapping("/delete-province")
    public String deleteProvince(Province province, Model model){
        provinceService.remove(province.getId());
        return "redirect:/province";
    }

}
