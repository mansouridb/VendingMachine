package Vending;

public class CashBundle {
    public int num1koron;
    public int num2Koron;
    public int num5Koron;
    public int num10Koron;
    public int num50Koron;
    public int num100Koron;
    public int num200Koron;
    public int num500Koron;
    public int num1000Koron;

    public CashBundle(int... enteredCash) {
        this.num1koron = enteredCash[0];
        this.num2Koron = enteredCash[1];
        this.num5Koron = enteredCash[2];
        this.num10Koron = enteredCash[3];
        this.num50Koron = enteredCash[4];
        this.num100Koron = enteredCash[5];
        this.num200Koron = enteredCash[6];
        this.num500Koron = enteredCash[7];
        this.num1000Koron = enteredCash[8];
    }
}