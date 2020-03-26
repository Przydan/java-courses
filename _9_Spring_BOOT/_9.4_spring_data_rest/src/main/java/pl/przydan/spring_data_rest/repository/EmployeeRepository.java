package pl.przydan.spring_data_rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.przydan.spring_data_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
