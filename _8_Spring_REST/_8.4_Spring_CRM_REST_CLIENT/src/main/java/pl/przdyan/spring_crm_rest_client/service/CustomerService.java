package pl.przdyan.spring_crm_rest_client.service;


import pl.przdyan.spring_crm_rest_client.entity.Customer;

import java.util.Set;

public interface CustomerService {

    Set<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    void delete(Long id);

    Customer getCustomer(Long id);
}
