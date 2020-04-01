package pl.przydan.spring_crm_rest_api.DAO;


import pl.przydan.spring_crm_rest_api.entity.Customer;

import java.util.Set;

public interface CustomerDAO {

    Set<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    Customer getCustomer(Long id);

    void delete(Long id);
}
