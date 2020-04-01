package pl.przydan.AOP_web_app.service;

import pl.przydan.AOP_web_app.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    void delete(Long id);

    Customer getCustomer(Long id);
}
