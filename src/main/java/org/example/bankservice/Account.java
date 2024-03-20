package org.example.bankservice;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {


    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public Client getCustomer() {
        return customer;
    }

    public Account(String accountNumber, Client customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountBalance = new BigDecimal("0").setScale(2);
    }

    public void depositMoney(BigDecimal amount) {
        this.accountBalance = this.accountBalance.add(amount);
    }

    public void withdrawMoney(BigDecimal amount) {
        this.accountBalance = this.accountBalance.subtract(amount);
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }
}
