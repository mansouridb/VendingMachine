package org.example.vending;

public interface MachineCheck {
    CashBundle calculateChange();

    CashBundle calculateChange(MachineRequest request);
}
