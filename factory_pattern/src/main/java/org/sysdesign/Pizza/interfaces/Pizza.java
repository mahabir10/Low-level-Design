package org.sysdesign.Pizza.interfaces;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;

    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing Pizza");
    }

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
