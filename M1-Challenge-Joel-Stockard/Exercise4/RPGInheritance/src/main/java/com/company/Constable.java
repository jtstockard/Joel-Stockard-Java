package com.company;

public class Constable extends Character {
    private int jurisdiction;



    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean jurisdiction) {
        super("Parker", 60, 100, 60, 20, 5, false, false);
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    public boolean Arrest(String name, int speed, int jurisdiction) {
        this.jurisdiction = jurisdiction;
        if(speed > 20) {
            System.out.println(name + ", you are under arrest!");
            return true;
        } else {
            System.out.println("They got away!");
            return false;
        }
    }


}
