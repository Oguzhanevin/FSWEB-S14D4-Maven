package org.example.model;

public class Bread extends ProductForSale {
    private boolean isWholeWheat;


    public Bread(String type, double price, String description, boolean isWholeWheat) {
        super(type, price, description); // ProductForSale constructor'ını çağırıyoruz
        this.isWholeWheat = isWholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Whole Wheat: " + isWholeWheat);
    }

    public boolean isWholeWheat() {
        return isWholeWheat;
    }
}
