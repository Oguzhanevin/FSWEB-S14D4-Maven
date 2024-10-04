package org.example.model;

public class Coke extends ProductForSale {
    private int volume;


    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + " ml");
    }

    public int getVolume() {
        return volume;
    }
}
