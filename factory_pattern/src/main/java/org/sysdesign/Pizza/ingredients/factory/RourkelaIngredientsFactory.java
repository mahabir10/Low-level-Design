package org.sysdesign.Pizza.ingredients.factory;

import org.sysdesign.Pizza.ingredients.Dough.Dough;
import org.sysdesign.Pizza.ingredients.Dough.OdishaDough;
import org.sysdesign.Pizza.ingredients.Sauce.CuttackSauce;
import org.sysdesign.Pizza.ingredients.Sauce.Sauce;
import org.sysdesign.Pizza.ingredients.Topping.KendraparaToppings;
import org.sysdesign.Pizza.ingredients.Topping.Toppings;

import java.util.ArrayList;

public class RourkelaIngredientsFactory implements IngredientsFactory{
    @Override
    public Dough getDough() {
        return new OdishaDough();
    }

    @Override
    public Sauce getSauce() {
        return new CuttackSauce();
    }

    @Override
    public ArrayList<Toppings> getToppings() {
        ArrayList<Toppings> toppings = new ArrayList<>();
        toppings.add(new KendraparaToppings());
        return toppings;
    }
}
