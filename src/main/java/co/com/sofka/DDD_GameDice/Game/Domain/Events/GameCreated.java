package co.com.sofka.DDD_GameDice.Game.Domain.Events;

import co.com.sofka.DDD_GameDice.Game.Domain.Entity.Player;
import co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values.PlayerId;
import java.util.Map;

public class GameCreated {
    private final Map<PlayerId, Player> Players;


    public GameCreated(Map<PlayerId, Player> players) {
        this.Players = players;

    }

    public Map<PlayerId, Player> getPlayers () {
        return Players;
    }
}
