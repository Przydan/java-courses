package pl.przydan._2_Advance_Mapping.hb05_MTM.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;


@Entity
@Table(name = "instructor_detail")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = {"instructor"})
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "youtube_channel")
    private @NonNull String ytChannel;

    @Column
    private @NonNull String hobby;

    @OneToOne(mappedBy = "instructorDetail",
            cascade = {DETACH, MERGE, PERSIST, REFRESH})
    private Instructor instructor;

}


