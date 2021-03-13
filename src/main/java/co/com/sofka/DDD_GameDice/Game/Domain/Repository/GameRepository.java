package co.com.sofka.DDD_GameDice.Game.Domain.Repository;

import co.com.sofka.DDD_GameDice.Game.Domain.Entity.Game;

import java.util.List;
import java.util.Optional;

public interface GameRepository {
    void save(Game game);

}