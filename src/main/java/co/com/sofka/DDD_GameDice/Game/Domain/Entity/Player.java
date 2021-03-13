package co.com.sofka.DDD_GameDice.Game.Domain.Entity;

import co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values.Name;

public class Player {

    private final Name name;

    public Player(Name name) {
        this.name = name;
    }
}
