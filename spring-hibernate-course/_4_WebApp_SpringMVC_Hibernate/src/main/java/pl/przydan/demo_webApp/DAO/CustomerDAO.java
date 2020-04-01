package pl.przydan.demo_webApp.DAO;

import pl.przydan.demo_webApp.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    Customer getCustomer(Long id);

    void delete(Long id);
}
