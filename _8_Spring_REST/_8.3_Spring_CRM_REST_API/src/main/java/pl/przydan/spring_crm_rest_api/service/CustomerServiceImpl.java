package pl.przydan.spring_crm_rest_api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.przydan.spring_crm_rest_api.DAO.CustomerDAO;
import pl.przydan.spring_crm_rest_api.controller.exceptions.CustomerNotFoundException;
import pl.przydan.spring_crm_rest_api.entity.Customer;

import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public Set<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public Customer getCustomer(Long id) {
        Customer customer = customerDAO.getCustomer(id);
        if (customer == null) {
            throw new CustomerNotFoundException("User id not found - " + id);
        }
        return customer;
    }

    @Override
    @Transactional
    public void saveOrUpdate(Customer customer) {
        customerDAO.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Customer customer = customerDAO.getCustomer(id);
        if (customer == null) {
            throw new CustomerNotFoundException("User id not found - " + id);
        }
        customerDAO.delete(id);
    }
}
