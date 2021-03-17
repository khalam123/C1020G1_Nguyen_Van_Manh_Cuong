package case_study.controller;

import case_study.model.service.ServiceResort;
import case_study.service.service.RentTypeService;
import case_study.service.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ServiceResortController {
    @Autowired
    private ServiceResortService serviceResortService;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("/create_villa")
    public String createVilla(Model model){
//        ServiceResort serviceResort = new ServiceResort();

        model.addAttribute("serviceResorts",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());

        return "create_villa";
    }

    @PostMapping("/create_villa")
    public String createVila(Model model, ServiceResort serviceResort){
        serviceResortService.save(serviceResort);
        model.addAttribute("serviceResorts",serviceResort);
        return "redirect:/";
    }
    @GetMapping("/create_house")
    public String createHouse(Model model){

        model.addAttribute("serviceResorts",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());

        return "create_house";
    }

    @PostMapping("/create_house")
    public String createHouse(Model model, ServiceResort serviceResort){
        serviceResortService.save(serviceResort);
        model.addAttribute("serviceResorts",serviceResort);
        return "redirect:/";
    }
    @GetMapping("/create_room")
    public String createRoom(Model model){

        model.addAttribute("serviceResorts",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());

        return "create_room";
    }

    @PostMapping("/create_room")
    public String createRoom(Model model, ServiceResort serviceResort){
        serviceResortService.save(serviceResort);
        model.addAttribute("serviceResorts",serviceResort);
        return "redirect:/";
    }
}
