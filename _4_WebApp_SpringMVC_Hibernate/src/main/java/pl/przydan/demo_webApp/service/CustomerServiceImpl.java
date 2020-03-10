package pl.przydan.demo_webApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.przydan.demo_webApp.DAO.CustomerDAO;
import pl.przydan.demo_webApp.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public Customer getCustomer(Long id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Customer customer) {
        customerDAO.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        customerDAO.delete(id);
    }
}
