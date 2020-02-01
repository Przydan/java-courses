package pl.przydan._1_Spring_MVC.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;
    @NotNull(message = "is require")
//    @NotBlank(message = "not blank") is not required, we use InitBinder to trim whitespaces
    @Size(min = 2, message = "min 2 chars")
    private String lastName;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
