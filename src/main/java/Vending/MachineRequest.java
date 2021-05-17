package Vending;

public class MachineRequest {
    public Product product;
    public CashBundel enterCash;

    public MachineRequest(int SelectProduct, int ... enterCash) {
        this.product = null;
        this.entercash = new CashBundle(enterCash);
    }
}
