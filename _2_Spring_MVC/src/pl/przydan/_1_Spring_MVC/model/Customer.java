package pl.przydan._1_Spring_MVC.model;

import pl.przydan._1_Spring_MVC.annotations.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;

    @NotNull(message = "is require")
//    @NotBlank(message = "not blank") is not required, we use InitBinder to trim whitespaces
    @Size(min = 2, message = "min 2 chars")
    private String lastName;

    @NotNull(message = "is require")
    @Min(value = 0, message = "must be greater than or equals to zero")
    @Max(value = 10, message = "must be less than or equals to 10")
    private Integer freePasses;

    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "example -> 00-000")
    private String postalCode;

    @CourseCode
    private String courseCode;


    //TODO: find better solution :(
    @Pattern(regexp = "^.*(?=.{8,})(?=.* [a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*,>< \"]).*$"
            , message = "Musi zawierać małe i duże litery, cyfry, znaki specjalne, min 8 znaków")
    private String password;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
