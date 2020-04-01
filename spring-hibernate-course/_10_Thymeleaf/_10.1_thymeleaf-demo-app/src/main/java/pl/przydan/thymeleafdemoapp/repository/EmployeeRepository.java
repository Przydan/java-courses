package pl.przydan.thymeleafdemoapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.przydan.thymeleafdemoapp.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByOrderByLastNameAsc();

}
