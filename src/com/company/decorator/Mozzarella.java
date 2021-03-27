package com.company.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .50;
    }

}
