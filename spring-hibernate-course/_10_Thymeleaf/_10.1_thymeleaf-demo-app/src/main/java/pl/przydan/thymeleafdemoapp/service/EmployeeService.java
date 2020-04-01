package pl.przydan.thymeleafdemoapp.service;


import pl.przydan.thymeleafdemoapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findALl();

    Employee findById(int id);

    void save(Employee employee);

    void deleteEmployee(int id);
}
