package se.junior.developer.sudokubackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.junior.developer.sudokubackend.models.Game;

public interface GameRepo extends CrudRepository<Game, Long> {
}
