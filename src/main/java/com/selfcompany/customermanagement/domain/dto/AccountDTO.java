package com.selfcompany.customermanagement.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.selfcompany.customermanagement.domain.enums.AccountType;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDTO {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "account_number")
    private String accountNumber;
    @JsonProperty(value = "balance")
    private Double balance;
    @JsonProperty(value = "account_type")
    private AccountType AccountType;
    @JsonProperty(value = "created_date_time")
    private LocalDateTime createdDateTime;
    @JsonProperty(value = "customer")
    private CustomerDTO customer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public com.selfcompany.customermanagement.domain.enums.AccountType getAccountType() {
        return AccountType;
    }

    public void setAccountType(com.selfcompany.customermanagement.domain.enums.AccountType accountType) {
        AccountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}
