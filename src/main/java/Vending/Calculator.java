package Vending;

public interface Calculator {
    int calculateTotal(CashBundle enteredCoins);
    CashBundle calculateChange(int enteredByUserMoney);

}

