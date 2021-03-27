package com.company;

import com.company.decorator.Mozzarella;
import com.company.decorator.Pizza;
import com.company.decorator.PlainPizza;
import com.company.decorator.TomatoSauce;

public class Main {

    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
    }

}