package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @RequestMapping({"","/operator"})
    public ModelAndView opertor(@RequestParam(required = false) double num1, @RequestParam(required = false) double num2,
                                @RequestParam String operator){
        double result = calculatorService.operator(num1,num2,operator);
        ModelAndView modelAndView = new ModelAndView("result","result",result);
        modelAndView.addObject("operator",operator);
        return modelAndView;
    }
}
