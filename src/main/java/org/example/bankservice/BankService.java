package org.example.bankservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankService {

    private int counter = 0;
    private Map<String, Account> accounts = new HashMap<>();

    public String openAccount(Client customer) {
        String newAccountNumber = customer.hashCode()+"-"+(++counter);
        Account newAccount = new Account(newAccountNumber, customer);
        accounts.put(newAccountNumber,newAccount);
        return newAccountNumber;
    }

    public boolean transferAmount(String accountNumberFrom, String accountNumberTo, BigDecimal amount) {
        if( (!accountNumberFrom.equals(accountNumberTo))
                && (accounts.containsKey(accountNumberFrom))
                && (accounts.containsKey(accountNumberTo))) {
            accounts.get(accountNumberFrom).withdrawMoney(amount);
            accounts.get(accountNumberTo).depositMoney(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }
}
