package com.pluralsight.finance;

import java.math.BigDecimal;

public class FinanceApplication {
    static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal("12500"));
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal("1500"));
        // try to deposit money into both accounts
        account1.deposit(new BigDecimal(100));
        account2.deposit(new BigDecimal(100));
    }
}
