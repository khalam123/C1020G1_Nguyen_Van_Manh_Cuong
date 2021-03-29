package com.example.demo.controller;

import com.example.demo.model.SmartPhone;
import com.example.demo.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/smartphones")
public class SmartphoneController {
    @Autowired
    private SmartphoneService smartphoneService;
    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/create")
    public ModelAndView createSmartphonePage(){
        ModelAndView modelAndView = new ModelAndView("/new-phone");
        modelAndView.addObject("sPhone",new SmartPhone());
        return modelAndView;
    }

    @PostMapping(value = "/createnewPhone", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SmartPhone createSmartphone(@RequestBody SmartPhone smartPhone){
        return smartphoneService.save(smartPhone);
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<SmartPhone> allPhones(){
        return smartphoneService.findAll();
    }

    @GetMapping("")
    public ModelAndView allPhonePage(){
        ModelAndView modelAndView = new ModelAndView("/all-phone");
        modelAndView.addObject("allphones",allPhones());
        return modelAndView;
    }

    @PostMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SmartPhone deleteSmartphone(@PathVariable Integer id){
        return smartphoneService.remove(id);
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editSmartphonePage(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/edit-phone");
        SmartPhone smartPhone = smartphoneService.findById(id);
        modelAndView.addObject("sPhone",smartPhone);
        return modelAndView;
    }

    @PostMapping(value = "/edit/{id}", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SmartPhone editSmartphone(@PathVariable int id, @RequestBody SmartPhone smartPhone){
        smartPhone.setId(id);
        return smartphoneService.save(smartPhone);
    }

}
