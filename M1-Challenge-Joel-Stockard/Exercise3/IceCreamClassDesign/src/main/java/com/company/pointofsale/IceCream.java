package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;
    private boolean sprinkles;

    public IceCream(String flavor, double price, int quantity, boolean sprinkles) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.sprinkles = sprinkles;
    }
    public void customerOrder(String flavor, int quantity, boolean sprinkles) {
        System.out.println("Next Order: " + quantity + " scoops of " + flavor + " with " + sprinkles);
    }

    public void scoopIceCream(int scoops, int quantity, String flavor) {
        this.quantity = scoops * 3;
        System.out.format("We have " + this.quantity + " scoops of " + flavor +" ice cream left.");
        if(quantity >= 0 ) {
            System.out.println("Whoops, out of " + flavor + ". How about a different flavor?");
        }
    }

    public double sale(int scoops, double price) {
        this.price = price * scoops;
        System.out.println("Your total price is " + this.price + " dollars.");
        return price;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSprinkles() {
        return sprinkles;
    }

    public void setSprinkles(boolean sprinkles) {
        this.sprinkles = sprinkles;
    }
}
