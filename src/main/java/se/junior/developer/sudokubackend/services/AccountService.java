package se.junior.developer.sudokubackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.junior.developer.sudokubackend.models.Account;
import se.junior.developer.sudokubackend.repositories.AccountRepo;

@Service
public class AccountService {

    private final AccountRepo accountRepo;

    @Autowired
    public AccountService(AccountRepo accountRepo){
        this.accountRepo = accountRepo;
    }

    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }
}
