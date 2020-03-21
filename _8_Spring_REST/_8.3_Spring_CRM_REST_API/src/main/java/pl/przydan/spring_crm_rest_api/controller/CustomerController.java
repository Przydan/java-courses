package pl.przydan.spring_crm_rest_api.controller;

import org.springframework.web.bind.annotation.*;
import pl.przydan.spring_crm_rest_api.entity.Customer;
import pl.przydan.spring_crm_rest_api.service.CustomerService;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers")
    public Set<Customer> getCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable Long customerId) {
        return service.getCustomer(customerId);
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        // also, just in case the pass an id in JSON ... set id to 0
        // this also force a save of new item ... instead of update
        customer.setId(null);
        service.saveOrUpdate(customer);
        return customer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        service.saveOrUpdate(customer);
        return customer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) {
        service.delete(customerId);
        return "Deleted customer id -" + customerId;
    }

}
