package Vending;

public class MachineRequest {
    public Product selectnumber;
    public CashBundle enterCash;

    public MachineRequest(int SelectProduct, int... enterCash) {
        this.selectnumber=null;
        this.enterCash = new CashBundle(enterCash);
    }
}se
