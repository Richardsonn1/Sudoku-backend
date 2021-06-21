package se.junior.developer.sudokubackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.junior.developer.sudokubackend.models.Account;

public interface AccountRepo extends CrudRepository<Account, Long> {
}
