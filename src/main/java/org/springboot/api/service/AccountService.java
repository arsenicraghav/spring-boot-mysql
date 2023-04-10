package org.springboot.api.service;

import org.springboot.api.dto.Account;
import org.springboot.api.entity.AccountEntity;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.AccountRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
