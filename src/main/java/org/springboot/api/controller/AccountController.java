package org.springboot.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springboot.api.dto.Account;
import org.springboot.api.service.impl.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountServiceImpl;

    @GetMapping(path = "/accounts")
    public List<Account> getAccounts() {
        return accountServiceImpl.getAllAccounts();
    }

    @GetMapping(value = "/accounts/{id}")
    public @ResponseBody Account getAccountById(@PathVariable Integer id) {
        return accountServiceImpl.getAccountById(id);
    }

    @DeleteMapping(value = "/accounts/{id}")
    public HttpStatus deleteAccount(@PathVariable Integer id) {
        accountServiceImpl.deleteAccount(id);
        return HttpStatus.NO_CONTENT;
    }

    @PostMapping(value = "/accounts")
    public HttpStatus createAccount(@RequestBody Account account) {
        return accountServiceImpl.addAccount(account) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }

    @PutMapping(value = "/accounts")
    public HttpStatus updatePerson(@RequestBody Account account) {
        return accountServiceImpl.updateAccount(account) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
    }

}