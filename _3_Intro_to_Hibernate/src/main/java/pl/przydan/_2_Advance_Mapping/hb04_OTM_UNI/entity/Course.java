package pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"instructor"})
public class Course {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private @NonNull String title;

    @ManyToOne(cascade = {DETACH, MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(fetch = FetchType.LAZY, cascade = ALL)
    @JoinColumn(name = "course_id")
    private List<Review> reviews;

    public void add(Review review) {
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

}

