package pl.przydan.spring_crm_rest_api.controller.exceptions;

import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerErrorResponse {
    private @NonNull
    Integer status;
    private @NonNull
    String message;
    private @NonNull
    Long timestamp;
}
