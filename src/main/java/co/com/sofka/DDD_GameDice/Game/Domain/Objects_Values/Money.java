package co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values;

import co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values.ValueObjects;

public class Money implements ValueObjects {
    private final int value;

    public Money(int money) {
        this.value = Objects.requireNonNull(money);
        if (money <= -1) {
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    }
}