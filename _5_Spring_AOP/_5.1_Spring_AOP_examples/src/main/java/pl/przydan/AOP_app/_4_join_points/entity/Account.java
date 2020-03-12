package pl.przydan.AOP_app._4_join_points.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Account {
    private @NonNull String level;
    private @NonNull String name;
}
