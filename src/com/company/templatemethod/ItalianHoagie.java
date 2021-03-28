package com.company.templatemethod;

import java.util.Arrays;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    void addMeat() {
        System.out.println("Adding the mead: ");
        Arrays.stream(meatUsed).forEach(System.out::println);
    }

    @Override
    void addCheese() {
        System.out.println("Adding cheese: ");
        Arrays.stream(cheeseUsed).forEach(System.out::println);
    }

    @Override
    void addVegetables() {
        System.out.println("Adding veggies: ");
        Arrays.stream(veggiesUsed).forEach(System.out::println);
    }

    @Override
    void addCondiments() {
        System.out.println("Adding condiments: ");
        Arrays.stream(condimentsUsed).forEach(System.out::println);
    }

}
