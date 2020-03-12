package pl.przydan.AOP_web_app.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pl.przydan.AOP_web_app.entity.Customer;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {
        // get current hibernate session
        Session sf = sessionFactory.getCurrentSession();
        // create query ... sort by last name
        Query<Customer> query =
                sf.createQuery("from Customer order by lastName"
                        , Customer.class);

        // execute a query and get result list
        List<Customer> customers = query.getResultList();

        //return the results
        return customers;
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
        }else {
            sf.update(customer);
        }
    }
}
