package co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values;

import java.util.Objects;

public class Name {
    private final String value;

    public Name(String name) {
        this.value = Objects.requireNonNull(name);
        if (name.isBlank()) {
            throw new IllegalArgumentException("El nombre no contiene información");
        }
    }
    public String value() {
        return value;
    }
}
