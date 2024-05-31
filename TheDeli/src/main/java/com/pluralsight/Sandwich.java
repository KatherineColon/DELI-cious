package com.pluralsight;

import java.util.List;
public class Sandwich extends Items {
String size;
String breadType;
List<Topping> toppings;
boolean toasted;

public Sandwich(String name, double price, String size, String breadType, List<Topping> toppings, boolean toasted){
    super(name,price);
    this.size = size;
    this.breadType = breadType;
    this.toasted = toasted;
}
public String getSize(){
    return size;
}
public String getBreadType(){
    return breadType;
}
public List<Topping> getToppings(){
    return toppings;
}

    public boolean isToasted() {
        return toasted;
    }
}
