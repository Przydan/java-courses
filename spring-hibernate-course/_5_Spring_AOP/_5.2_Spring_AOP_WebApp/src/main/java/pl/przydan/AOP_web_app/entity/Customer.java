package pl.przydan.AOP_web_app.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private @NonNull
    String firstName;

    @Column(name = "last_name")
    private @NonNull
    String lastName;

    private @NonNull
    String email;

}