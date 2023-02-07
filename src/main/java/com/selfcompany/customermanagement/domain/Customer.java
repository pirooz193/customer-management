package com.selfcompany.customermanagement.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "customer_table")
@Cacheable
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;
    @Column(name = "national_code", nullable = false, unique = true, length = 15)
    private String nationalCode;
    @Column(name = "email_address", unique = true, length = 30)
    private String emailAddress;
    @Column(name = "phone_number", unique = true, length = 30)
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "birthDate")
    private LocalDate birthDate;
    @Column(name = "account_status")
    private boolean accountStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return accountStatus == customer.accountStatus && id.equals(customer.id) && name.equals(customer.name) && lastName.equals(customer.lastName) && nationalCode.equals(customer.nationalCode) && emailAddress.equals(customer.emailAddress) && phoneNumber.equals(customer.phoneNumber) && address.equals(customer.address) && birthDate.equals(customer.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, nationalCode, emailAddress, phoneNumber, address, birthDate, accountStatus);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                ", accountStatus=" + accountStatus +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
}
