package org.example.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private double damage;

    // Constructor
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    // Abstract attack method will be implemented by subclasses
    public abstract double attack();
}
