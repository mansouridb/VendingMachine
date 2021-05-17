package Vending;

public enum Product {
    drinks(1,20), food(2,100), sweets(3,60),    fruits(4,50), etc(0,0);
    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price) {
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber() {
        return selectionNumber;
    }

    public void setSelectionNumber(int selectionNumber) {
        this.selectionNumber = selectionNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

