package org.springboot.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springboot.api.dto.Account;
import org.springboot.api.entity.AccountEntity;
import org.springboot.api.exception.AccountNotFoundException;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.AccountRespository;
import org.springboot.api.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRespository accountRespository;

    @Transactional
    public List<Account> getAllAccounts() {
        return ((List<AccountEntity>) accountRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }

    @Transactional
    public Account getAccountById(Integer id) {
        Optional<AccountEntity> account = accountRespository.findById(id);
        if (account.isPresent()) {
            return Mapper.map(((AccountEntity) account.get()));
        }
        throw new AccountNotFoundException(id);
    }

    @Transactional
    public void deleteAccount(Integer id) {
        accountRespository.deleteById(id);
    }

    @Transactional
    public boolean addAccount(Account account) {
        return accountRespository.save(Mapper.map(account)) != null;
    }

    @Transactional
    public boolean updateAccount(Account account) {
        return accountRespository.save(Mapper.map(account)) != null;
    }

}
