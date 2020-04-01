package pl.przydan.rest_api_spring_data.controller;


import org.springframework.web.bind.annotation.*;
import pl.przydan.rest_api_spring_data.entity.Employee;
import pl.przydan.rest_api_spring_data.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.findALl();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        service.save(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        service.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee byId = service.findById(id);

        if (byId == null) {
            throw new RuntimeException("Employee not exists with the id - " + id);
        }
        service.deleteEmployee(id);

        return "Deleted employee id - " + id;
    }


}
