package com.selfcompany.customermanagement.service;

import com.selfcompany.customermanagement.domain.dto.AccountDTO;

public interface AccountService {
    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getRequiredAccount(String accountNumber);

    void deleteAccount(String accountNumber);
}
