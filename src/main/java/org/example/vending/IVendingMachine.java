package org.example.vending;

public interface IVendingMachine {

    void displayProducts();

    void selectProduct(int product);

     void displayEnterCashMessage();

    void enterCash(int... Cash);

    void displayChangeMessage();

    }
