package org.sysdesign.PizzaStore.interfaces;

import org.sysdesign.Pizza.interfaces.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType){
        Pizza pizza = this.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);
}
