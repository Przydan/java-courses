package pl.przydan.spring_rest_app.entity;

import lombok.Data;
import lombok.NonNull;

@Data

public class Student {
    private @NonNull
    Long id;
    private @NonNull
    String firstName;
    private @NonNull
    String lastName;
}
