package pl.przydan.AOP_app._6_after_throwing.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull String level;
    private @NonNull String name;
}
