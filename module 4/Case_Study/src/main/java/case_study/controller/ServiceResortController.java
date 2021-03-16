package case_study.controller;

import case_study.service.RentTypeService;
import case_study.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ServiceResortController {
    @Autowired
    private ServiceResortService serviceResortService;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("/create_villa")
    public String 
}
