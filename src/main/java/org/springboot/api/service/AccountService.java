package org.springboot.api.service;

import org.springboot.api.dto.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAllAccounts();

    public Account getAccountById(Integer id);

    public void deleteAccount(Integer id);

    public boolean addAccount(Account account);

    public boolean updateAccount(Account account);
}
