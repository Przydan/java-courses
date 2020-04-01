package pl.przydan.rest_api_spring_data.service;


import pl.przydan.rest_api_spring_data.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findALl();

    Employee findById(int id);

    void save(Employee employee);

    void deleteEmployee(int id);
}
