package pl.przydan.spring_crm_rest_api.service;


import pl.przydan.spring_crm_rest_api.entity.Customer;

import java.util.Set;

public interface CustomerService {

    Set<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    void delete(Long id);

    Customer getCustomer(Long id);
}
