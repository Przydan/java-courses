package pl.przydan.spring_rest_app.controller.exceptions;

import lombok.Data;

@Data
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;
}
