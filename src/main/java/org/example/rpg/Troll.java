package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    // Constructor
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // Bleedable interface implementation
    @Override
    public double bleed() {
        // Kanama, hasarın %25'i kadar olacak
        return getDamage() * 0.25;
    }

    // Poisonable interface implementation
    @Override
    public double poison() {
        // Zehirlenme, hasarın %30'u kadar olacak
        return getDamage() * 0.3;
    }

    // Override attack method to return damage + bleed + poison
    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
