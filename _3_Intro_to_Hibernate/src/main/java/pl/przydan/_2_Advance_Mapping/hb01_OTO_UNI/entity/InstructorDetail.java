package pl.przydan._2_Advance_Mapping.hb01_OTO_UNI.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "instructor_detail")
@NoArgsConstructor
@RequiredArgsConstructor
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "youtube_channel")
    private @NonNull String ytChannel;

    private @NonNull String hobby;
}


