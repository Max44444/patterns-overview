package com.company;

import com.company.factory.EnemyShip;
import com.company.factory.EnemyShipFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            theEnemy = shipFactory.makeEnemyShip(scanner.nextLine());
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        }
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
