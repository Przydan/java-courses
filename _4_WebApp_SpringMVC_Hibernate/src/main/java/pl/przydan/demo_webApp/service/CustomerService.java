package pl.przydan.demo_webApp.service;

import pl.przydan.demo_webApp.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    void delete(Long id);

    Customer getCustomer(Long id);
}
