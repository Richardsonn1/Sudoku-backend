package se.junior.developer.sudokubackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.junior.developer.sudokubackend.models.Account;
import se.junior.developer.sudokubackend.services.AccountService;

@RestController()
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(Account account){
        return accountService.createAccount(account);
    }
}
