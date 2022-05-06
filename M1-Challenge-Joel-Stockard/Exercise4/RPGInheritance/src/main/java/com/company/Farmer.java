package com.company;

public class Farmer extends Character {
    private String harvest;
    private String plowing;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super("Nathan", 75, 100, 75, 10, 1, false, false);
    }
    public String getHarvest() {
        return harvest;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
    }

    public String getPlowing() {
        return plowing;
    }

    public void setPlowing(String plowing) {
        this.plowing = plowing;
    }

}
