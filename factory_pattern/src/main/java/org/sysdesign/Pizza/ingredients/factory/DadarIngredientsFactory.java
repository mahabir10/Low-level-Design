package org.sysdesign.Pizza.ingredients.factory;

import org.sysdesign.Pizza.ingredients.Dough.Dough;
import org.sysdesign.Pizza.ingredients.Dough.MumbaiDough;
import org.sysdesign.Pizza.ingredients.Sauce.NagpurSauce;
import org.sysdesign.Pizza.ingredients.Sauce.Sauce;
import org.sysdesign.Pizza.ingredients.Topping.AurangabadToppings;
import org.sysdesign.Pizza.ingredients.Topping.Toppings;

import java.util.ArrayList;

public class DadarIngredientsFactory implements IngredientsFactory{
    @Override
    public Dough getDough() {
        return new MumbaiDough();
    }

    @Override
    public Sauce getSauce() {
        return new NagpurSauce();
    }

    @Override
    public ArrayList<Toppings> getToppings() {
        ArrayList<Toppings> toppings = new ArrayList<>();
        toppings.add(new AurangabadToppings());
        return toppings;
    }
}
