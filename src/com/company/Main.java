package com.company;

import com.company.prototype.CloneFactory;
import com.company.prototype.Sheep;

public class Main {

    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sheep = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sheep);

        System.out.println(sheep);
        System.out.println(clonedSheep);
        System.out.println("sheep hashcode: " + System.identityHashCode(sheep));
        System.out.println("clone hashcode: " + System.identityHashCode(clonedSheep));
    }

}