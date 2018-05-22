package com.codecool.restaurant;

import java.util.Random;

public class Chef extends CanCook {
    public Chef(String name, String birthday, Float salary, Kitchen kitchen) {
        super(name, birthday, salary, kitchen);
    }

    @Override
    public void Cook() {
        Random rand = new Random();
        if (rand.nextInt(10)>7) {
            this.askForIngredient();
        } else {
            System.out.println(this.name + " says: Some Yelling");
        }
    }

    private void askForIngredient(){
        boolean gotAny = false;
        for (Helpers helper : this.kitchen.getHelpers()) {
            Ingredients gotOne = helper.giveIngredient();
            if (gotOne!=null) {
                System.out.println(this.name + " got one " + gotOne);
                gotAny=true;
                break;
            }

        }
        if (!gotAny) {
            for (Helpers helper : this.kitchen.getHelpers()) {
                helper.shoutOut();

            }
        }

    }
}
