package co.com.sofka.DDD_GameDice.Game.Domain.Entity;
import co.com.sofka.DDD_GameDice.Game.Domain.Objects_Values.PlayerId;
import java.util.Map;

public class Game {

    protected Map<PlayerId, Player> Players;
    public boolean GameStarted;

    public Game(Map<PlayerId, Player> players, boolean gameStarted) {
        Players = players;
        GameStarted = gameStarted;

    }
}
