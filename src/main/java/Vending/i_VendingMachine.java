package Vending;

public interface i_VendingMachine {

    void displayProducts();

    void selectProduct(int product);

    void displayEnterCoinsMessage();

    void enterCoins(int... Cash);

    void displayChangeMessage();

    }
