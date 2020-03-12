package pl.przydan.AOP_app._7_after_finally.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull String level;
    private @NonNull String name;
}
