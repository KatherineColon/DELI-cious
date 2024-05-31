package com.pluralsight;

public class Topping extends Items{
    boolean premium;

    public Topping (String name, double price, boolean premium){
        super(name,price);
        this.premium = premium;
    }

    public boolean isPremium(){
        return premium;
    }

}
