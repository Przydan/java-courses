package pl.przydan._2_Advance_Mapping.hb03_OTM_Bi.entity;

import lombok.*;

import javax.persistence.*;

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

}

