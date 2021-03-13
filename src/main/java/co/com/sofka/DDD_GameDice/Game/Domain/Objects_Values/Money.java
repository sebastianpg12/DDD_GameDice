package co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values;
import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Money implements ValueObject {
    private final int value;

    public Money(int money) {
        this.value = Objects.requireNonNull(money);
        if (money <= -1) {
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    }

    @Override
    public Object value() {
        return value;
    }
}