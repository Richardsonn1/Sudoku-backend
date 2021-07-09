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

    public Game createGame(GameDto gameDto) {
        return gameRepo.save(GameMapper.INSTANCE.dtoToGame(gameDto));
    }
}
