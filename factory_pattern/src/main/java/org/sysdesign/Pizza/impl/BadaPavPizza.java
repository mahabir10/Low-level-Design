package org.sysdesign.Pizza.impl;

import org.sysdesign.Pizza.ingredients.factory.IngredientsFactory;
import org.sysdesign.Pizza.interfaces.Pizza;

public class BadaPavPizza extends Pizza {


    IngredientsFactory ingredientsFactory;

    public BadaPavPizza(IngredientsFactory ingredientsFactory){
        this.name = "BadaPav Pizza";
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing BadaPav Pizza");
        this.dough = ingredientsFactory.getDough();
        this.sauce = ingredientsFactory.getSauce();
        this.toppings = ingredientsFactory.getToppings();
    }
}
