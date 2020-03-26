package pl.przydan.rest_api_spring_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.przydan.rest_api_spring_data.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
