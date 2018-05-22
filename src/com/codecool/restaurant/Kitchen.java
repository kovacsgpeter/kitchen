package com.codecool.restaurant;

import java.util.*;

public class Kitchen {
    static Kitchen kitchen;
    List<Helpers> helpers;
    List<CanCook> chefs;
    List<CanCook> cooks;

    public List<Helpers> getHelpers() {
        return helpers;
    }

    public void init(){
        helpers=new ArrayList<>();
        chefs = new ArrayList<>();
        cooks = new ArrayList<>();


        helpers.add(new Helpers("Bela", "1990", 22300.0f, kitchen));
        helpers.add(new Helpers("Zoli", "1990", 12200.0f, kitchen));
        helpers.add(new Helpers("Manna", "1990", 32300.0f, kitchen));

        cooks.add(new Cook("Anita", "1989", 45500.0f, kitchen));

        chefs.add(new Chef("Margit", "1939", 95500.0f, kitchen));


    }

    public void simulate(int rep){
        int counter =10;
        System.out.println("Simulation Started");


        for (Helpers helper : kitchen.getHelpers()) {
            int val =0;
            for (Map.Entry<Ingredients,Integer> ingredient : helper.ingredients.entrySet()) {
                val+=ingredient.getValue();
            }
            System.out.println(helper.name + " " + val);


        }

        for (int i = 0; i < rep; i++) {
            for (CanCook chef : chefs) {
                chef.Cook();
                if (getKnives(counter)) {
                    chef.getKnife();
                } else {
                    counter--;
                }
            }
            for (CanCook cook : cooks) {
                cook.Cook();
                if (getKnives(counter)) {
                    cook.getKnife();
                } else {
                    counter--;
                }

            }

        }
    }

    private boolean getKnives(int seed) {

        Random rand = new Random();

        if (rand.nextInt(seed)<4) {
            return true;
        } else {
            return false;
        }
    }




    public static void main(String[] args) {
        Kitchen a = new Kitchen();
        Kitchen.kitchen=a;
        a.init();
        a.simulate(90);

    }

}
