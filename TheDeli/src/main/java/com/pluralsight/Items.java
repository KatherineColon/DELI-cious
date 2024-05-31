package com.pluralsight;

public abstract class Items {
    String name;
    double price;

    public Items(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }


}
