package org.sysdesign.PizzaStore.impl;

import org.sysdesign.Pizza.impl.DahiVadaPizza;
import org.sysdesign.Pizza.impl.PakhalaPizza;
import org.sysdesign.Pizza.interfaces.Pizza;
import org.sysdesign.PizzaStore.interfaces.PizzaStore;

import java.util.Objects;

public class OdishaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {

        if(Objects.equals(pizzaType, "dahivada")){
            return new DahiVadaPizza();
        }
        else if(Objects.equals(pizzaType, "pakhala")){
            return new PakhalaPizza();
        }
        else{
            System.out.println("Specified Pizza not found");
            throw new RuntimeException("Specified Pizza not found");
        }

    }

}
