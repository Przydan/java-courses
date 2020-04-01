package pl.przydan.AOP_web_app.DAO;

import pl.przydan.AOP_web_app.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveOrUpdate(Customer customer);

    Customer getCustomer(Long id);

    void delete(Long id);
}
