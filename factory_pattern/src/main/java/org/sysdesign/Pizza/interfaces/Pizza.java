package org.sysdesign.Pizza.interfaces;

import org.sysdesign.Pizza.ingredients.Dough.Dough;
import org.sysdesign.Pizza.ingredients.Sauce.Sauce;
import org.sysdesign.Pizza.ingredients.Topping.Toppings;
import org.sysdesign.Pizza.ingredients.factory.IngredientsFactory;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;

    public ArrayList<Toppings> toppings = new ArrayList<>();


    public abstract void prepare();

    public void bake() {
        System.out.println("Baking started");
        try {
            sleep(500);
        }
        catch (Exception e){
            System.out.println("Got some exception while baking");
            System.out.println("Anyway continuing");
        }

        System.out.println("Baking ended");
    }

    public void cut(){
        System.out.println("Cut the cake");
    }

    public void box(){
        System.out.println("Boxed the cake");
    }

    public String getName(){
        return this.name;
    }
}
