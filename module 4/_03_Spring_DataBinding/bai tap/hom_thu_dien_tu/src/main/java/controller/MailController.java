package controller;

import model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailController {
    @GetMapping({"","/home"})
    public String showForm(Model model){
        model.addAttribute("mail",new Mail());
        List<String> listLanguage = new ArrayList<>();
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");
        listLanguage.add("Germany");
        model.addAttribute("listLanguage",listLanguage);

        List<String> listPageSize = new ArrayList<>();
        listPageSize.add("5%");
        listPageSize.add("10%");
        listPageSize.add("15%");
        listPageSize.add("25%");
        listPageSize.add("50%");
        listPageSize.add("100%");
        model.addAttribute("listPageSize",listPageSize);

        return "home";
    }

    @PostMapping
    public String submit(@ModelAttribute("mail") Mail mail, Model model){
        String msg = "";
        if (!mail.getSpamsFilter()){
            msg = "Disable spams filter";
        }else
            msg = "Enable spams filter";

        model.addAttribute("language", mail.getLanguage());
        model.addAttribute("pageSize", mail.getPageSize());
        model.addAttribute("spamsFilter", msg);
        model.addAttribute("signature", mail.getSignature());

        return "info";
    }
}
