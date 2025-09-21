package org.sysdesign.PizzaStore.impl;

import org.sysdesign.Pizza.impl.BadaPavPizza;
import org.sysdesign.Pizza.ingredients.factory.DadarIngredientsFactory;
import org.sysdesign.Pizza.ingredients.factory.IngredientsFactory;
import org.sysdesign.Pizza.interfaces.Pizza;
import org.sysdesign.PizzaStore.interfaces.PizzaStore;

import java.util.Objects;

public class MumbaiPizzaStore extends PizzaStore {

    IngredientsFactory ingredientsFactory;

    public MumbaiPizzaStore(){
        this.ingredientsFactory = new DadarIngredientsFactory();
    }

    @Override
    protected Pizza createPizza(String pizzaType) {

        if(Objects.equals(pizzaType, "badapav")){
            return new BadaPavPizza(this.ingredientsFactory);
        }
        else{
            System.out.println("Specified Pizza not found");
            throw new RuntimeException("Specified Pizza not found");
        }

    }
}
