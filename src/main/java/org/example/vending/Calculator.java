package org.example.vending;

public interface Calculator {
    int calculateTotal(CashBundle enterCash);
    CashBundle calculateChange(int enteredByUserMoney);
}

