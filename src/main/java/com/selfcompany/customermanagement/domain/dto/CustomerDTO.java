package com.selfcompany.customermanagement.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {
    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "lastName")
    private String lastName;
    @JsonProperty(value = "nationalCode")
    private String nationalCode;
    @JsonProperty(value = "emailAddress")
    private String emailAddress;
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;
    @JsonProperty(value = "accountStatus")
    private boolean accountStatus;

    @JsonProperty(value = "accounts")
    private List<AccountDTO> accounts = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return accountStatus == that.accountStatus && id.equals(that.id) && name.equals(that.name) && lastName.equals(that.lastName) && nationalCode.equals(that.nationalCode) && emailAddress.equals(that.emailAddress) && phoneNumber.equals(that.phoneNumber) && address.equals(that.address) && birthDate.equals(that.birthDate) && accounts.equals(that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, nationalCode, emailAddress, phoneNumber, address, birthDate, accountStatus, accounts);
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                ", accountStatus=" + accountStatus +
                ", accounts=" + accounts +
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

    public List<AccountDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDTO> accounts) {
        this.accounts = accounts;
    }
}
