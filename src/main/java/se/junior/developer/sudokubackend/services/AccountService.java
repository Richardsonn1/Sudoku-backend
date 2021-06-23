package se.junior.developer.sudokubackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.junior.developer.sudokubackend.dtos.AccountDto;
import se.junior.developer.sudokubackend.mappers.AccountMapper;
import se.junior.developer.sudokubackend.models.Account;
import se.junior.developer.sudokubackend.repositories.AccountRepo;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepo accountRepo;

    @Autowired
    public AccountService(AccountRepo accountRepo){
        this.accountRepo = accountRepo;
    }

    /**
     * createAccount method adds and saves a new account to the database.
     * @param account contains username & password to the created account.
     */
    public Account createAccount(AccountDto account) {
        return accountRepo.save(AccountMapper.INSTANCE.dtoToAccount(account));
    }

    public List<Account> getAccounts() {
        return accountRepo.findAll();
    }
}
