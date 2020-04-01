package pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = {"instructorDetail", "courses"})
public class Instructor {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private @NonNull
    String firstName;

    @Column(name = "last_name")
    private @NonNull
    String lastName;

    @Column
    private @NonNull
    String email;

    @OneToOne(cascade = ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

    @OneToMany(mappedBy = "instructor",
            cascade = {DETACH, MERGE, PERSIST, REFRESH},
            fetch = FetchType.LAZY)
    private List<Course> courses;


    public void add(Course tempCourse) {

        if (courses == null) {
            courses = new ArrayList<>();
        }

        courses.add(tempCourse);
        tempCourse.setInstructor(this);
    }

}
