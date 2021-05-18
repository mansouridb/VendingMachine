package Vending;

public interface MachineCheck {
    CashBundle calculateChange();

    CashBundle calculateChange(MachineRequest request);
}
