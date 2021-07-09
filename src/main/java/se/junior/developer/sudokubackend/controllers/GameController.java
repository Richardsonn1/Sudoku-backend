package se.junior.developer.sudokubackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.junior.developer.sudokubackend.dtos.GameDto;
import se.junior.developer.sudokubackend.models.Game;
import se.junior.developer.sudokubackend.services.GameService;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @PostMapping
    public Game createGame(GameDto gameDto){
        return gameService.createGame(gameDto);
    }

    @GetMapping()
    public Game getGameById(@Param("id") Long id){
        return gameService.getGameById(id);
    }
}
