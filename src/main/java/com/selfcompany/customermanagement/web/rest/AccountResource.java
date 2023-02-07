package com.selfcompany.customermanagement.web.rest;

import com.selfcompany.customermanagement.domain.dto.AccountDTO;
import com.selfcompany.customermanagement.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/account")
public class AccountResource {

    private final AccountService accountService;

    public AccountResource(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/create-new-account")
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO) {
        AccountDTO createdAccount = accountService.createAccount(accountDTO);
        return ResponseEntity.created(URI.create("/create-new-account")).body(createdAccount);
    }

    @GetMapping(value = "/get-account")
    public ResponseEntity<AccountDTO> getAccount(@RequestParam String accountNumber) {
        AccountDTO requiredAccount = accountService.getRequiredAccount(accountNumber);
        return ResponseEntity.ok().body(requiredAccount);
    }

    @DeleteMapping(value = "delete-account")
    public ResponseEntity<?> deleteAccount(@RequestParam String accountNumber) {
        accountService.deleteAccount(accountNumber);
        return ResponseEntity.ok().build();
    }
}
