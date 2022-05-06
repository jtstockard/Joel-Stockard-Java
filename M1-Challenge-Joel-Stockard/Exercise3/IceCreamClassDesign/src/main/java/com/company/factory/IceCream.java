package com.company.factory;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public double valueOfIceCreamMade(double salePrice, double productionCost) {
        double Profit = salePrice / productionCost;
        System.out.println("We make ice cream at " + this.productionCost + "and sell it for " + this.salePrice + "to make this much back");
        return Profit;
    }
    public int totalProductionTime(int pints) {
        this.productionTime = productionTime * pints;
        System.out.println("It will take " + this.productionTime + " minutes to make " + pints + " pints of " + this.flavor + " ice cream.");
        return productionTime;
    }
    public String produceSomeIceCream(String[] ingredients) {
        this.ingredients = ingredients;
        String product = String.valueOf(getIngredients());
        System.out.println("We took these " + this.ingredients + "and it takes " + this.productionTime + "minutes to make!");
        return product;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
