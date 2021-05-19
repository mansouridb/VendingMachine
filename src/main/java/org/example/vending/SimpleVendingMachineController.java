package org.example.vending;

public class SimpleVendingMachineController implements MachineCheck {
    private  Calculator calculator = new SimpleCalculator();
    private MachineRequest machineRequest;

    public SimpleVendingMachineController() {
        super();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public SimpleVendingMachineController(Calculator calculator, MachineRequest request) {
        this.calculator = calculator;
        this.machineRequest = request;
    }

    @Override
    public CashBundle calculateChange() {
        return calculateChange();
    }

    @Override
    public CashBundle calculateChange(MachineRequest request) {
        this.machineRequest = request;
        int total = calculator.calculateTotal(request.enterCash);
        int totalChange = total - request.product.getPrice();
        return calculator.calculateChange(totalChange);
    }
}
