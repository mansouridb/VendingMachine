package org.example.vending;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        MachineCheck machineCheck = new SimpleVendingMachineController();
        int enterCash[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        CashBundle cashBundle = new CashBundle(enterCash);
        IVendingMachine machineInterface = new TextVendingMachineInterface(machineCheck, 2, cashBundle);
        machineInterface.displayProducts();


        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCashMessage();

        String userEnteredCash = scanner.nextLine();
        machineInterface.enterCash(enterCash);

        machineInterface.displayChangeMessage();

    }
}