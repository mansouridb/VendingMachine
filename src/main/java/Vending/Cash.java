package Vending;

public enum Cash {
    EttKoron(1), tvoKoron(2), femKoron(5), tioKoron(10), fimtiokoron(50), Etthundrakoron(100), tvoHundra(200), femHundraKoron(500), etttTusenkoron(1000);

    Cash(int value, int cashValue) {
        this.value = value;
        this.cashValue = cashValue;
    }

    Cash(int value) {
        this.value = value;
    }

    private int value;

    private int cashValue;


    public int getCashValue() {
        return cashValue;
    }

    public int getValue() {
        return value;
    }

    public static int[] parseCash(String cash) {
        String[] numberCashInText = cash.split(",");
        int[] result = new int[numberCashInText.length];
        for (int index = 0; index < numberCashInText.length; index++) {
            result[index] = Integer.parseInt(numberCashInText[index]);
        }
        return result;
    }
}