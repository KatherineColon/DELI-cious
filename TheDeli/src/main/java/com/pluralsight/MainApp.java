package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to DELI-cious!");
        while (true) {
            System.out.println("1.New Order");
            System.out.println("0.Exit");
            System.out.print("Please select an option: ");
            String option = scanner.nextLine();

            if ("1".equals(option)) {
                System.out.println("You've selected New Order. ");
                Order order = new Order();
                orderScreen(scanner);
                break;
            } else if ("0".equals(option)) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid option, please try again. ");
            }
        }
    }
    public static void orderScreen (Scanner scanner){

        while (true) {
            System.out.println("Welcome to the Order Screen!");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel");
            System.out.print("Please select an option: ");
            String orderOption = scanner.nextLine();

            switch(orderOption) {
                case "1":
                    addSandwich(scanner);
                    break;
                case "2":
                    //addDrink method
                    break;
                case "3":
                    //addChips method
                    break;
                case "4":
                    //checkout method
                    break;
                case "0":
                    System.out.println("Order canceled");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }
    }
}
public static void addSandwich(Scanner scanner){
    String breadType = "";
    while (true) {
        System.out.println("1. White");
        System.out.println("2. Wheat");
        System.out.println("3. Rye");
        System.out.println("4. Wrap");
        System.out.print("Please select a bread type: ");
        String breadOption = scanner.nextLine();

        switch (breadOption) {
            case "1":
                breadType = "White";
                System.out.println(breadType);
                break;
            case "2":
                breadType = "Wheat";
                System.out.println(breadType);
                break;
            case "3":
                breadType = "Rye";
                System.out.println(breadType);
                break;
            case "4":
                breadType = "Wrap";
                System.out.println(breadType);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                continue;
        }
        break;
    }

    String size ="";
    while (true) {
        System.out.println("1. 4 inch");
        System.out.println("2. 8 inch");
        System.out.println("3. 12 inch");
        System.out.print("Please select a size: ");
        String sizeOption = scanner.nextLine();

        switch (sizeOption) {
            case "1":
                size = "4 inch";
                System.out.println(size);
                break;
            case "2":
                size = "8 inch";
                System.out.println(size);
                break;
            case "3":
                size = "12 inch";
                System.out.println(size);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                continue;
        }
        break;
    }

    List<Topping> toppings = new ArrayList<>();
    boolean addingToppings = true;

    while (addingToppings) {
        System.out.println("Select toppings (type 'done' to finish):");
        System.out.println("1. Meat");
        System.out.println("2. Cheese");
        System.out.println("3. Other");
        System.out.println("4. Sauces");
        System.out.print("Please select a topping: ");
        String toppingOption = scanner.nextLine();

        switch (toppingOption) {
            case "1":
                System.out.print("Enter meat topping: ");
                toppings.add(new Topping(scanner.nextLine(), 0.00, true));
                break;
            case "2":
                System.out.print("Enter cheese topping: ");
                toppings.add(new Topping(scanner.nextLine(), 0.00, true));
                break;
            case "3":
                System.out.print("Enter other topping: ");
                toppings.add(new Topping(scanner.nextLine(), 0.00, false));
                break;
            case "4":
                System.out.print("Enter sauce: ");
                toppings.add(new Topping(scanner.nextLine(), 0.00, false));
                break;
            case "done":
                addingToppings = false;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    boolean toasted = false;
    while (true) {
        System.out.println("Would you like the sandwich toasted?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please select an option: ");
        String toastedOption = scanner.nextLine();
        if ("1".equals(toastedOption)) {
            toasted = true;
            break;
        } else if ("2".equals(toastedOption)) {
            toasted = false;
            break;
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }


}
    public static void addDrink (){
        while (true){
            System.out.println();
        }

}
}