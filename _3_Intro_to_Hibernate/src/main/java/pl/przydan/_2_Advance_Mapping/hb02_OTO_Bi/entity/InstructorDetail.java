package pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "instructor_detail")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = {"instructor"})
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private @NonNull String ytChannel;

    @Column(name = "hobby")
    private @NonNull String hobby;

    @OneToOne(mappedBy = "instructorDetail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Instructor instructor;

}


