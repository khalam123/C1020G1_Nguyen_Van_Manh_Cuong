package case_study.controller;

import case_study.model.customer.Customer;
import case_study.service.customer.CustomerService;
import case_study.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/customer")
    public String listCustomer(Model model, @PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("customers",customerService.findAll(pageable));
//        model.addAttribute("customers",customerService.findAll());

        return "list_customer";
    }

    @GetMapping("/view_customer/{id}")
    public String viewCustomer(@PathVariable Integer id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customers",customer);
        return "view_customer";
    }

    @GetMapping("/create_customer")
    public String showCreateCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("customers", customer);
        model.addAttribute("customerType",customerTypeService.findAll());
        return "create_customer";
    }

    @PostMapping("/create_customer")
    public String createCustomer(@Valid Customer customer, BindingResult bindingResult, Model model,){

        if (bindingResult.hasFieldErrors()){
            return "create_customer";
        }else{
            customerService.save(customer);
            model.addAttribute("customers", customer);
            model.addAttribute("message","New customer created");
            return "redirect:/customer";
        }

    }

    @GetMapping("/edit_customer/{id}")
    public String showEditCustomer(@PathVariable Integer id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customerType",customerTypeService.findAll());
        model.addAttribute("customers",customer);
        return "edit_customer";
    }

    @PostMapping("/edit_customer")
    public String updateCustomer(@Valid Customer customer,BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "edit_customer";
        }else{
            customerService.save(customer);
            model.addAttribute("customers",customer);
            model.addAttribute("message","Customer was updated");
            return "redirect:/customer";
        }

    }

    @PostMapping("/delete_customer")
    public String deleteCustomer(@RequestParam("delete_modal") int id){
        customerService.remove(id);
        return "redirect:/customer";
    }


}
