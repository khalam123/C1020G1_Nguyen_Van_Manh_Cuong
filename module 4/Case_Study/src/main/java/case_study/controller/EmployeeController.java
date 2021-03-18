package case_study.controller;

import case_study.model.customer.Customer;
import case_study.model.employee.Employee;
import case_study.service.employee.DivisionService;
import case_study.service.employee.EducationDegreeService;
import case_study.service.employee.EmployeeService;
import case_study.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EducationDegreeService educationDegreeService;

    @GetMapping("/employee")
    public String listEmployee(Model model, @PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("employees",employeeService.findAll(pageable));
        return "employee_list";
    }


    @GetMapping("/employee_view/{id}")
    public String viewEmployee(@PathVariable Integer id, Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employees",employee);
        return "employee_view";
    }

    @GetMapping("/employee_create")
    public String showCreateEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("division",divisionService.findAll());
        model.addAttribute("educationDegree",educationDegreeService.findAll());
        return "employee_create";
    }

    @PostMapping("/employee_create")
    public String createEmployee(Model model, @Valid Employee employee, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("positionList",positionService.findAll());
            model.addAttribute("division",divisionService.findAll());
            model.addAttribute("educationDegree",educationDegreeService.findAll());
            return "employee_create";
        }else {
            employeeService.save(employee);
            model.addAttribute("employees", employeeService.findAll());
            model.addAttribute("message", "New employee created");
            return "redirect:/employee";
        }
    }

    @GetMapping("/employee_edit/{id}")
    public String showEditEmployee(@PathVariable Integer id, Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("position",positionService.findAll());
        model.addAttribute("division",divisionService.findAll());
        model.addAttribute("educationDegree",educationDegreeService.findAll());
        model.addAttribute("employee",employee);
        return "employee_edit";
    }

    @PostMapping("/employee_edit")
    public String updateCustomer(@Valid Employee employee,BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("position",positionService.findAll());
            model.addAttribute("division",divisionService.findAll());
            model.addAttribute("educationDegree",educationDegreeService.findAll());
            return "employee_edit";
        }else {
            employeeService.save(employee);
            model.addAttribute("employees", employeeService.findAll());
            model.addAttribute("message", "Employee was updated");
            return "redirect:/employee";
        }
    }

    @PostMapping("/employee_delete")
    public String deleteCustomer(@RequestParam("delete_modal") int id){
        employeeService.remove(id);
        return "redirect:/employee";
    }

    @GetMapping("/employee_search")
    public String index(Model model, @PageableDefault (size = 5) Pageable pageable, @RequestParam("keyword") Optional<String> keyword){
        Page<Employee> employees;
        if (keyword.isPresent()){
            employees = employeeService.findAllInputText(keyword.get() ,pageable) ;
        } else {
            employees = employeeService.findAll(pageable) ;
        }
        model.addAttribute("employees", employees);
        return "/employee_list";
    }


}
