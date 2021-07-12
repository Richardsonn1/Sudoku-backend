package se.junior.developer.sudokubackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.junior.developer.sudokubackend.dtos.GameDto;
import se.junior.developer.sudokubackend.mappers.GameMapper;
import se.junior.developer.sudokubackend.models.Game;
import se.junior.developer.sudokubackend.repositories.GameRepo;

@Service
public class GameService {

    private final GameRepo gameRepo;

    @Autowired
    public GameService(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }

    /**
     * createGame method adds and saves a new game to the database.
     * @param gameDto contains gameId, accountId, map & finishTime.
     */
    public Game createGame(GameDto gameDto) {
        return gameRepo.save(GameMapper.INSTANCE.dtoToGame(gameDto));
    }

    public Game getGameById(Long id) {
        return gameRepo.getGameById(id);
    }
}
