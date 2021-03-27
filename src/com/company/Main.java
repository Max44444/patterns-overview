package com.company;


import com.company.adapter.EnemyAttacker;
import com.company.adapter.EnemyRobot;
import com.company.adapter.EnemyRobotAdapter;
import com.company.adapter.EnemyTank;

public class Main {

    public static void main(String[] args) {
        EnemyAttacker enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker enemyAttacker = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The tank");
        attack(enemyTank);

        System.out.println("The robot");
        attack(enemyAttacker);
    }

    public static void attack(EnemyAttacker enemyAttacker) {
        enemyAttacker.fireWeapon();
    }

}