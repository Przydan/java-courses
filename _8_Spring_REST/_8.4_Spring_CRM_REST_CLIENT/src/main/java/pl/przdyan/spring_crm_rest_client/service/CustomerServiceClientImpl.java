package pl.przdyan.spring_crm_rest_client.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.przdyan.spring_crm_rest_client.entity.Customer;

import java.util.Set;
import java.util.logging.Logger;

@Service
public class CustomerServiceClientImpl implements CustomerService {

    private static final Logger log = Logger.getLogger(CustomerServiceClientImpl.class.getName());

    private RestTemplate restTemplate;
    private String crmRestUrl;

    public CustomerServiceClientImpl(RestTemplate restTemplate,
                                     @Value("${crm.rest.url}") String crmRestUrl) {
        this.restTemplate = restTemplate;
        this.crmRestUrl = crmRestUrl;

        log.info("|=--> Loaded property: crm.rest.url=" + crmRestUrl);
    }


    @Override
    public Set<Customer> getCustomers() {
        log.info("|=--> in getCustomers(): Calling REST API " + crmRestUrl);

        // make REST call
        ResponseEntity<Set<Customer>> responseEntity =
                restTemplate.exchange(crmRestUrl,
                        HttpMethod.GET, null,
                        new ParameterizedTypeReference<>() {
                        });
        // get the list of customers from response
        Set<Customer> customers = responseEntity.getBody();

        log.info("|=--> in getCustomers(): customers " + customers);

        return customers;
    }

    @Override
    public Customer getCustomer(Long id) {
        log.info("|=--> in getCustomer(): Calling REST API " + crmRestUrl);

        // make REST call
        // get customer
        Customer customer = restTemplate.getForObject(crmRestUrl + "/" + id, Customer.class);

        log.info("|=--> in getCustomer(): customer " + customer);

        return customer;
    }

    @Override
    public void saveOrUpdate(Customer customer) {
        log.info("|=--> in saveOrUpdate(): Calling REST API " + crmRestUrl);

        Long customerId = customer.getId();

        // make REST call
        if (customerId == null) {
            // add employee
            restTemplate.postForEntity(crmRestUrl, customer, String.class);
        } else {
            // update employee
            restTemplate.put(crmRestUrl, customer);
        }

        log.info("|=--> in saveOrUpdate(): customer " + customer);
    }

    @Override
    public void delete(Long id) {
        log.info("|=--> in getCustomer(): Calling REST API " + crmRestUrl);

        // make REST call
        restTemplate.delete(crmRestUrl + "/" + id);

        log.info("|=--> in getCustomer(): customer " + id);
    }
}
