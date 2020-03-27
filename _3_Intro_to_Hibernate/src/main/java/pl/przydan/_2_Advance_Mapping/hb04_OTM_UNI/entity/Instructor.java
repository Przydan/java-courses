package pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

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
            fetch = LAZY,
            cascade = {DETACH, MERGE, PERSIST, REFRESH})
    private List<Course> courses;


    public void add(Course tempCourse) {

        if (courses == null) {
            courses = new ArrayList<>();
        }

        courses.add(tempCourse);
        tempCourse.setInstructor(this);
    }

}
