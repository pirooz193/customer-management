package com.selfcompany.customermanagement.service.impl;

import com.selfcompany.customermanagement.domain.Account;
import com.selfcompany.customermanagement.domain.dto.AccountDTO;
import com.selfcompany.customermanagement.repository.AccountRepository;
import com.selfcompany.customermanagement.service.AccountService;
import com.selfcompany.customermanagement.service.mapper.AccountMapper;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        Account account = accountMapper.toEntity(accountDTO);
        Account savedAccount = accountRepository.save(account);
        return accountMapper.toDto(savedAccount);
    }

    @Override
    public AccountDTO getRequiredAccount(String accountNumber) {
        Account requiredAccount = accountRepository.findAccountByAccountNumber(accountNumber);
        return accountMapper.toDto(requiredAccount);
    }

    @Override
    public void deleteAccount(String accountNumber) {
        Account account = accountRepository.findAccountByAccountNumber(accountNumber);
        accountRepository.deleteById(account.getId());
    }

}
