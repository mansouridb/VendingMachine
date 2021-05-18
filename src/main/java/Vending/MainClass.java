package Vending;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        i_VendingMachine machineInterface = null;
        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCashMessage();

        String userEnteredCash = scanner.nextLine();
        int[] enterCash = {};
        machineInterface.enterCash(enterCash);

        machineInterface.displayChangeMessage();

    }
}