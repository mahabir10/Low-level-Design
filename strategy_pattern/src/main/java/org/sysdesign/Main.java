package org.sysdesign;

import org.sysdesign.models.Duck;
import org.sysdesign.models.MallardDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introducing Duck Simulation!!");

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }
}