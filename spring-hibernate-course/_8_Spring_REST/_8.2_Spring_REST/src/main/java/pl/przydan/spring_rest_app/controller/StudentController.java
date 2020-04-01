package pl.przydan.spring_rest_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.przydan.spring_rest_app.entity.Student;
import pl.przydan.spring_rest_app.repisitory.InMemoryStudentRepo;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class StudentController {
    private InMemoryStudentRepo repo;

    public StudentController(InMemoryStudentRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/students")
    public Set<Student> getStudents(@PathVariable(required = false) Long id) {

        return repo.getStudents();
    }
}
