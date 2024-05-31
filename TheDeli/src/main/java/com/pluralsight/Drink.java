package com.pluralsight;

public class Drink extends Items{
    String size;

    public Drink(String size, String name, double price){
        super(name, price);
        this.size = size;
    }
    public String getSize(){
        return size;
    }


}
