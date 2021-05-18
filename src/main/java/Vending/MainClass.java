package Vending;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI ui =null;
        ui.displayProducts();

        String selectedProduct = scanner.nextLine();
        ui.selectProduct(Integer.parseInt(selectedProduct));

        i_VendingMachine.displayEnterCashMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = {};
        i_VendingMachine.enterCash(enteredCoins);

        i_VendingMachine.displayChangeMessage();

    }
}
