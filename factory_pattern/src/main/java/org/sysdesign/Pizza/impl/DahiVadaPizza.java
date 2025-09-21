package org.sysdesign.Pizza.impl;

import org.sysdesign.Pizza.ingredients.factory.IngredientsFactory;
import org.sysdesign.Pizza.interfaces.Pizza;

public class DahiVadaPizza extends Pizza {

    IngredientsFactory ingredientsFactory;

    public DahiVadaPizza(IngredientsFactory ingredientsFactory){
        this.name = "DahiVada Pizza";
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing DahiVada Pizza");
        this.dough = ingredientsFactory.getDough();
        this.sauce = ingredientsFactory.getSauce();
        this.toppings = ingredientsFactory.getToppings();
    }

}
