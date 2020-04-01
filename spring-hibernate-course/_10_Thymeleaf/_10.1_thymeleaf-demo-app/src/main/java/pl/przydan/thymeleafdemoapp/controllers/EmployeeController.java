package pl.przydan.thymeleafdemoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.przydan.thymeleafdemoapp.entity.Employee;
import pl.przydan.thymeleafdemoapp.service.EmployeeService;

import java.util.Date;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String getAllEmployees(Model model) {
        model
                .addAttribute("date", new Date())
                .addAttribute("employees", service.findALl());
        return "employees/employees-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAddEmployee(Model model) {
        model
                .addAttribute("date", new Date())
                .addAttribute("employee", new Employee());
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee) {
        service.save(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(Model model, @RequestParam Integer employeeID) {
        model
                .addAttribute("date", new Date())
                .addAttribute("employee", service.findById(employeeID));
        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer employeeID) {
        service.deleteEmployee(employeeID);
        return "redirect:/employees/list";
    }
}
