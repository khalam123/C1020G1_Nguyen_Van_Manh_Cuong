package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ConvertService;

@Controller
public class ConvertController {
    @Autowired
    private ConvertService convertService;

    @GetMapping({"","/convert"})
//    public String convert(@RequestParam String money, Model model) {
//        double result = convertService.convert(Double.parseDouble(money));
//        model.addAttribute("resultConvert", result);
//        return "result";
    public ModelAndView convert(@RequestParam String money) {
        double result = convertService.convert(Double.parseDouble(money));
        return new ModelAndView("result","resultConvert",result);
    }
}
