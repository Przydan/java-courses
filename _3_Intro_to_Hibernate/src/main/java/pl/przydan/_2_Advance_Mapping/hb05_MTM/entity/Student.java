package pl.przydan._2_Advance_Mapping.hb05_MTM.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"courses"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private @NonNull String firstName;

    @Column(name = "last_name")
    private @NonNull String lastName;

    private @NonNull String email;

    @ManyToMany(fetch = LAZY,
            cascade = {DETACH, MERGE, PERSIST, REFRESH})
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}