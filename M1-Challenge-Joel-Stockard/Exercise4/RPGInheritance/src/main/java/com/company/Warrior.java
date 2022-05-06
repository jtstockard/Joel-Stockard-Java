package com.company;

public class Warrior extends Character {

    private int shieldStr = 100;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super("Lokar", 75, 100, 100, 50, 10, false, false);
    }

    public int getShieldStr() {
        return shieldStr;
    }

    public void setShieldStr(int shieldStr) {
        this.shieldStr = shieldStr;
    }


}
