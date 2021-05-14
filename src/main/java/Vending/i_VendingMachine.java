package Vending;

public interface i_VendingMachine {
    void showProducts();
    void selectProduct(int product);
    void showEnterCurrencyMessag();
    void addCurrency (int amount);
    void showmodifymessage();
    int getBalance();
    String use();

    }
