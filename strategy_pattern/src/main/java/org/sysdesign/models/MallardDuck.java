package org.sysdesign.models;

import org.sysdesign.FlyBehavior.FlyWithWings;
import org.sysdesign.QuackBehavior.Quack;

public class MallardDuck extends Duck{


    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!!");
    }
}
