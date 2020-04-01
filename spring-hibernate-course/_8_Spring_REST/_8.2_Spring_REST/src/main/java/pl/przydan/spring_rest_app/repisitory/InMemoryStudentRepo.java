package pl.przydan.spring_rest_app.repisitory;

import org.springframework.stereotype.Repository;
import pl.przydan.spring_rest_app.entity.Student;

import java.util.HashSet;
import java.util.Set;

@Repository
public class InMemoryStudentRepo {

    public Set<Student> getStudents() {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1L, "Mario", "Destroyer"));
        students.add(new Student(2L, "Luigi", "Greater"));
        students.add(new Student(3L, "Alice", "Synthesis"));
        return students;
    }

}
