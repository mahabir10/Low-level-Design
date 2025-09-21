package org.sysdesign.Pizza.ingredients.factory;

import org.sysdesign.Pizza.ingredients.Dough.Dough;
import org.sysdesign.Pizza.ingredients.Sauce.Sauce;
import org.sysdesign.Pizza.ingredients.Topping.Toppings;

import java.util.ArrayList;

public interface IngredientsFactory {
    Dough getDough();
    Sauce getSauce();
    ArrayList<Toppings> getToppings();

}
