package com.company.templatemethod;

import java.util.Arrays;

public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {}

    @Override
    void addCheese() {}

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
