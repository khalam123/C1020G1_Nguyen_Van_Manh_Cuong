package case_study.controller;

import case_study.model.service.ServiceResort;
import case_study.service.service.RentTypeService;
import case_study.service.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class ServiceResortController {
    @Autowired
    private ServiceResortService serviceResortService;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("/create_villa")
    public String createVilla(Model model){
        model.addAttribute("serviceResort",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());
        return "create_villa";
    }

    @PostMapping("/create_villa")
    public String createVila(Model model,@Valid ServiceResort serviceResort, BindingResult bindingResult){
        if  (bindingResult.hasFieldErrors()){
            model.addAttribute("rentType",rentTypeService.findAll());
            return "create_villa";
        }else {
            serviceResortService.save(serviceResort);
            model.addAttribute("serviceResorts", serviceResort);
            return "redirect:/";
        }
    }

    @GetMapping("/create_house")
    public String createHouse(Model model){
        model.addAttribute("serviceResort",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());
        return "create_house";
    }

    @PostMapping("/create_house")
    public String createHouse(Model model, @Valid ServiceResort serviceResort, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("rentType",rentTypeService.findAll());
            return "create_house";
        }else {
            serviceResortService.save(serviceResort);
            model.addAttribute("serviceResorts", serviceResort);
            return "redirect:/";
        }
    }
    @GetMapping("/create_room")
    public String createRoom(Model model){

        model.addAttribute("serviceResort",new ServiceResort());
        model.addAttribute("rentType",rentTypeService.findAll());

        return "create_room";
    }

    @PostMapping("/create_room")
    public String createRoom(Model model,@Valid ServiceResort serviceResort,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("rentType",rentTypeService.findAll());
            return "create_room";
        }else {
            serviceResortService.save(serviceResort);
            model.addAttribute("serviceResorts", serviceResort);
            return "redirect:/";
        }
    }
}
