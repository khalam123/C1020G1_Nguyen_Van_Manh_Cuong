package case_study.controller;

import case_study.model.contract.Contract;
import case_study.service.contract.ContractService;
import case_study.service.customer.CustomerService;
import case_study.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/contract")
    public String listContract(@PageableDefault(size = 3) Pageable pageable, Model model){
        model.addAttribute("contract",contractService.findAllByContract(LocalDate.now().toString(),pageable));
        return "list_contract";
    }
    @GetMapping("/create_contract")
    public String createContract(Model model){
        model.addAttribute("employees",employeeService.findAll());
        model.addAttribute("customers",customerService.findAll());
        model.addAttribute("contract",new Contract());
        return "create_contract";

    }

    @PostMapping("/create_contract")
    public String createContract(Contract contract, Model model){
        contractService.save(contract);
        model.addAttribute("contract",new Contract());
        return "redirect:/contract";
    }

}
