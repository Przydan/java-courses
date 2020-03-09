package pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = {"instructorDetail"})
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private @NonNull String firstName;

    @Column(name = "last_name")
    private @NonNull String lastName;

    @Column(name = "email")
    private @NonNull String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

}
