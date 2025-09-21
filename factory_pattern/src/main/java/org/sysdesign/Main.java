package org.sysdesign;

import org.sysdesign.Pizza.interfaces.Pizza;
import org.sysdesign.PizzaStore.impl.MumbaiPizzaStore;
import org.sysdesign.PizzaStore.impl.OdishaPizzaStore;
import org.sysdesign.PizzaStore.interfaces.PizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore mumbaiPizzaStore = new MumbaiPizzaStore();
        PizzaStore odishaPizzaStore = new OdishaPizzaStore();

        Pizza misalPizza = mumbaiPizzaStore.orderPizza("misal");
        Pizza pakhalaPizza = odishaPizzaStore.orderPizza("pakhala");

    }
}