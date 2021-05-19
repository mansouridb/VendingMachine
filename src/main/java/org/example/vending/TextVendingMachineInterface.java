package org.example.vending;
import org.example.vending.IVendingMachine;
public class TextVendingMachineInterface implements IVendingMachine {
    @Override
    public String toString() {
        return super.toString();
    }

    private MachineCheck controller = new SimpleVendingMachineController();
    private int selectedProduct;
    private CashBundle change;

    public TextVendingMachineInterface(MachineCheck controller, int selectedProduct, CashBundle change) {
        this.controller = controller;
        this.selectedProduct = selectedProduct;
        this.change = change;
    }
   @Override
    public void displayProducts() {
        System.out.println("Products list:   ");
        System.out.println("                 ");
        for(Product product: Product.values()){
            if(!Product.etc.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                ");
        System.out.println(" Please select your product: ");
    }

    @Override
    public void selectProduct(int product) {

    }


    @Override
    public void displayEnterCashMessage() {
        System.out.println(" Please enter Cashes : ");
        System.out.println(" num of 1 Koron cash,num of 2 Koron cash ,num of 5 Koron cash ,num of 10 Koron cash ,num of 50 Koron cash , num of 100 koron cash ,num of 200 Koron cash , num of 500 koron cash, num of 1000 koron cash  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten Koron : 0,2,0,0,0");
        System.out.println("Please enter Cash:");
    }

    @Override
    public void enterCash(int... cash) {

    }


    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+"cents split as follows: ");
        System.out.println("    1 Koron Cash: "+ change.num1koron);
        System.out.println("    2 Koron Cash: "+ change.num2Koron);
        System.out.println("    5 koron Cash: "+ change.num5Koron);
        System.out.println("    10 koron cash: "+ change.num10Koron);
        System.out.println("    50 Koron cash: "+ change.num50Koron);
        System.out.println("    100 Koron Cash: "+ change.num100Koron);
        System.out.println("    200 Koron Cash: "+ change.num200Koron);
        System.out.println("    500 koron Cash: "+ change.num500Koron);
        System.out.println("    1000 koron cash: "+ change.num1000Koron);

    }
}
