package pl.przydan.spring_crm_rest_api.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pl.przydan.spring_crm_rest_api.entity.Customer;

import java.util.HashSet;
import java.util.Set;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Set<Customer> getCustomers() {
        // get current hibernate session
        Session sf = sessionFactory.getCurrentSession();
        // create query ... sort by last name
        Query<Customer> query =
                sf.createQuery("FROM Customer", Customer.class);

        //return the results
        return new HashSet<>(query.getResultList());
    }

    @Override
    public Customer getCustomer(Long id) {
        Session sf = sessionFactory.getCurrentSession();
        return sf.get(Customer.class, id);
    }

    @Override
    public void delete(Long id) {
        Session sf = sessionFactory.getCurrentSession();
        Customer customer = getCustomer(id);
        sf.remove(customer);
    }

    @Override
    public void saveOrUpdate(Customer customer) {
        Session sf = sessionFactory.getCurrentSession();
        if (customer.getId() == null) {
            sf.save(customer);
        } else {
            sf.update(customer);
        }
    }
}
