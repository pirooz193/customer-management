package com.selfcompany.customermanagement.domain;

import com.selfcompany.customermanagement.domain.enums.AccountType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "account_table")
@Cacheable
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_number", nullable = false, unique = true, length = 30)
    private String accountNumber;
    @Column(name = "account_type")
    private AccountType AccountType;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id.equals(account.id) && accountNumber.equals(account.accountNumber) && AccountType == account.AccountType && balance.equals(account.balance) && createdDateTime.equals(account.createdDateTime) && customer.equals(account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, AccountType, balance, createdDateTime, customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", AccountType=" + AccountType +
                ", balance=" + balance +
                ", createdDateTime=" + createdDateTime +
                ", customer id =" + customer.getId() +
                '}';
    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
