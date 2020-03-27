package pl.przydan.AOP_app._5_after_returning.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull
    String level;
    private @NonNull
    String name;
}
