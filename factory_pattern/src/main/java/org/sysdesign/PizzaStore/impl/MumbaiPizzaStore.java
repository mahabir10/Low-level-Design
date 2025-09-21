package org.sysdesign.PizzaStore.impl;

import org.sysdesign.Pizza.impl.BadaPavPizza;
import org.sysdesign.Pizza.impl.MisalPavPizza;
import org.sysdesign.Pizza.interfaces.Pizza;
import org.sysdesign.PizzaStore.interfaces.PizzaStore;

import java.util.Objects;

public class MumbaiPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {

        if(Objects.equals(pizzaType, "badapav")){
            return new BadaPavPizza();
        }
        else if(Objects.equals(pizzaType, "misal")){
            return new MisalPavPizza();
        }
        else{
            System.out.println("Specified Pizza not found");
            throw new RuntimeException("Specified Pizza not found");
        }

    }
}
