package pl.przydan.db_rest_api.DAO;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pl.przydan.db_rest_api.entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAO_HibernateImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAO_HibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findALl() {
        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        // create query
        Query<Employee> query
                = session.createQuery("from Employee ", Employee.class);

        // execute the query , get and return result list
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Employee.class, id);
    }


    @Override
    public void save(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = entityManager.unwrap(Session.class);

        Query query
                = session.createQuery("DELETE from Employee where id=:employeeId");

        query.setParameter("employeeId", id);

        query.executeUpdate();
    }
}
