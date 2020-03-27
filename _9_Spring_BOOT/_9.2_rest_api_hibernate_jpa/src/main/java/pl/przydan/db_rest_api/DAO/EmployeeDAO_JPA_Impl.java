package pl.przydan.db_rest_api.DAO;


import org.springframework.stereotype.Repository;
import pl.przydan.db_rest_api.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class EmployeeDAO_JPA_Impl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAO_JPA_Impl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findALl() {
        Query query =
                entityManager.createQuery("from Employee");
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Employee employeeMerge = entityManager.merge(employee);
        employee.setId(employeeMerge.getId());
    }

    @Override
    public void deleteEmployee(int id) {
        Query query
                = entityManager.createQuery("DELETE from Employee where id=:employeeId");

        query.setParameter("employeeId", id);

        query.executeUpdate();
    }
}
