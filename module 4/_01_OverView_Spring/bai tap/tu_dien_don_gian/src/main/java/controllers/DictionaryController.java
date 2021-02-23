package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping({"","/dictionary"})
    public ModelAndView translate(@RequestParam String text){
        String result = dictionaryService.translate(text);
        //        modelAndView.addObject("text");
        return new ModelAndView("result","resultTranslate",result);
        
    }
}
