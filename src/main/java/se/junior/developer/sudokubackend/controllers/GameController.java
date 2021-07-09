package se.junior.developer.sudokubackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Game addGame(GameDto gameDto){
        return gameService.addGame(gameDto);
    }
}
