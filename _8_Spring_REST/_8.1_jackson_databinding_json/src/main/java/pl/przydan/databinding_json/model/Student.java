package pl.przydan.databinding_json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private String[] languages;

    private Address address;
}