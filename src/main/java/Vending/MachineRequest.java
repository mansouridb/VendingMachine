package Vending;

public class MachineRequest {
    public Product product;
    public CashBundle enterCash;

    public MachineRequest(int SelectProduct, int... enterCash) {
        this.product=null;
        this.enterCash = new CashBundle(enterCash);
    }
}
