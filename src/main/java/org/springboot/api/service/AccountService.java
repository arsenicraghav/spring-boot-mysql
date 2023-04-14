package org.springboot.api.service;

import lombok.RequiredArgsConstructor;
import org.springboot.api.dto.Account;
import org.springboot.api.entity.AccountEntity;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.AccountRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRespository accountRespository;

    public List<Account> getAllAccounts() {
        return ((List<AccountEntity>) accountRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }

    public Account getAccountById(Integer id) {
        Optional<AccountEntity> account = accountRespository.findById(id);
        if (account.isPresent()) {
            return Mapper.map(((AccountEntity) account.get()));
        }
        return null;
    }

    public void deleteAccount(Integer id) {
        accountRespository.deleteById(id);
    }

    public boolean addAccount(Account account) {
        return accountRespository.save(Mapper.map(account)) != null;
    }

    public boolean updateAccount(Account account) {
        return accountRespository.save(Mapper.map(account)) != null;
    }

}
