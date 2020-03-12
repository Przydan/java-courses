package pl.przydan.AOP_app._9_around_advice_exceptions_handling.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull String level;
    private @NonNull String name;
}
