package pl.przydan.AOP_app._8_around_advice.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull
    String level;
    private @NonNull
    String name;
}
