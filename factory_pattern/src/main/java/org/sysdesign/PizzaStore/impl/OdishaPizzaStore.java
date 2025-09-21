package org.sysdesign.PizzaStore.impl;

import org.sysdesign.Pizza.impl.DahiVadaPizza;
import org.sysdesign.Pizza.ingredients.factory.IngredientsFactory;
import org.sysdesign.Pizza.ingredients.factory.RourkelaIngredientsFactory;
import org.sysdesign.Pizza.interfaces.Pizza;
import org.sysdesign.PizzaStore.interfaces.PizzaStore;

import java.util.Objects;

public class OdishaPizzaStore extends PizzaStore {

    IngredientsFactory ingredientsFactory = new RourkelaIngredientsFactory();

    @Override
    protected Pizza createPizza(String pizzaType) {

        if(Objects.equals(pizzaType, "dahivada")){
            return new DahiVadaPizza(this.ingredientsFactory);
        }
        else{
            System.out.println("Specified Pizza not found");
            throw new RuntimeException("Specified Pizza not found");
        }

    }

}
