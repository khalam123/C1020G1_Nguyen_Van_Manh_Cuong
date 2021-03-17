package case_study.controller;

import case_study.model.contract.ContractDetail;
import case_study.service.contract.AttachServiceService;
import case_study.service.contract.ContractDetailService;
import case_study.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractDetailController {
    @Autowired
    private ContractDetailService contractDetailService;
    @Autowired
    private ContractService contractService;
    @Autowired
    private AttachServiceService attachServiceService;

    @GetMapping("/create_contract_detail")
    public String createContractDetail(Model model){
        model.addAttribute("attachService",attachServiceService.findAll());
        model.addAttribute("contract",contractService.findAll());
        model.addAttribute("contractDetail",new ContractDetail());
        return "create_contract_detail";
    }

    @PostMapping("/create_contract_detail")
    public String createContractDetail(ContractDetail contractDetail, Model model){
        contractDetailService.save(contractDetail);
        model.addAttribute("contractDetail",new ContractDetail());
        return "redirect:/list_contract";
    }

}
