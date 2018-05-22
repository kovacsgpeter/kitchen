package com.codecool.restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Helpers extends Employee{

    Map<Ingredients, Integer> ingredients= new HashMap<>();

    public Helpers(String name, String birthday, Float salary, Kitchen kitchen) {
        super(name, birthday, salary, kitchen);
        Random rand = new Random();
        for (Ingredients ingredient: Ingredients.values()) {
            this.ingredients.put(ingredient, rand.nextInt(3)+1);
        }
    }

    public Ingredients giveIngredient(){
        Ingredients ret = null;
        if (this.isIngredientsEmpty()) {
            return null;
        } else {
            for (Map.Entry<Ingredients, Integer> ingredient : ingredients.entrySet()) {
                if (ingredient.getValue()>0) {
                    ingredient.setValue(ingredient.getValue()-1);
                    ret = ingredient.getKey();
                    System.out.println("ingredient given");
                    break;
                }
            }
        }
        return ret;
    }

    private boolean isIngredientsEmpty() {
        boolean isEmpty =true;
        for (Integer ingredient : ingredients.values()) {
            if (ingredient > 0) {
                isEmpty= false;
            }
        }
        return isEmpty;

    }

    public void shoutOut(){
        System.out.println(this.name + ": We are Out!");
    }



}
