package com.selfcompany.customermanagement.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.selfcompany.customermanagement.domain.enums.TransactionType;

import java.time.LocalDateTime;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "localDateTime")
    private LocalDateTime localDateTime;
    @JsonProperty(value = "amount")
    private double amount;
    @JsonProperty(value = "transactionType")
    private TransactionType transactionType;
    @JsonProperty(value = "account")
    private AccountDTO account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDTO that = (TransactionDTO) o;
        return Double.compare(that.amount, amount) == 0 && id.equals(that.id) && localDateTime.equals(that.localDateTime) && transactionType == that.transactionType && account.equals(that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localDateTime, amount, transactionType, account);
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", account=" + account +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }
}
