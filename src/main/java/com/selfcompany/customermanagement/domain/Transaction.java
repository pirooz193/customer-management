package com.selfcompany.customermanagement.domain;

import com.selfcompany.customermanagement.domain.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "transaction_table")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "local_date_time")
    private LocalDateTime localDateTime;
    @Column(name = "amount")
    private double amount;
    @Column(name = "transaction_type")
    private TransactionType transactionType;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 && id.equals(that.id) && localDateTime.equals(that.localDateTime) && transactionType == that.transactionType && account.equals(that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localDateTime, amount, transactionType, account);
    }

    @Override
    public String toString() {
        return "Transaction{" +
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
