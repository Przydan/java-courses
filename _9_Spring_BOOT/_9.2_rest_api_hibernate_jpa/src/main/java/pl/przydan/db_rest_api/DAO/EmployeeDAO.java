package pl.przydan.db_rest_api.DAO;

import pl.przydan.db_rest_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findALl();

    Employee findById(int id);

    void save(Employee employee);

    void deleteEmployee(int id);
}
