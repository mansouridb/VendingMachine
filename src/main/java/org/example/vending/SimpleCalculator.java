package org.example.vending;

public class SimpleCalculator implements Calculator {
    @Override
    public int calculateTotal(CashBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CashBundle calculateChange(int amountMoneyToReturn) {
        CashBundle change = new CashBundle(new int[8]);
        int remainingAmount = amountMoneyToReturn;
        change.num1000Koron = remainingAmount / Cash.etttTusenkoron.getValue();
        remainingAmount = remainingAmount % Cash.etttTusenkoron.getValue();

        change.num500Koron = remainingAmount / Cash.femHundraKoron.getValue();
        remainingAmount = remainingAmount % Cash.fimtiokoron.getValue();

        change.num100Koron = remainingAmount / Cash.Etthundrakoron.getValue();
        remainingAmount = remainingAmount % Cash.Etthundrakoron.getValue();

        change.num50Koron = remainingAmount / Cash.femKoron.getValue();
        remainingAmount = remainingAmount % Cash.femKoron.getValue();

        change.num10Koron = remainingAmount / Cash.tioKoron.getValue();
        remainingAmount = remainingAmount % Cash.tioKoron.getValue();

        change.num5Koron = remainingAmount / Cash.femKoron.getValue();
        remainingAmount = remainingAmount % Cash.femKoron.getValue();

        change.num2Koron = remainingAmount / Cash.tvoKoron.getValue();
        remainingAmount = remainingAmount % Cash.tvoKoron.getValue();


        return change;
    }

    private void Bundle(int[] ints) {
    }
}
