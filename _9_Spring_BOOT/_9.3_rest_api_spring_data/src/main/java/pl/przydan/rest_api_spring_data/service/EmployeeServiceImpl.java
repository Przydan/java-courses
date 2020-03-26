package pl.przydan.rest_api_spring_data.service;


import org.springframework.stereotype.Service;
import pl.przydan.rest_api_spring_data.entity.Employee;
import pl.przydan.rest_api_spring_data.repository.EmployeeRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Employee> findALl() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }else {
            throw new NoSuchElementException("Employee not found with id - " + id);
        }
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
