package com.codecool.restaurant;

public class Cook extends CanCook {

    public Cook(String name, String birthday, Float salary, Kitchen kitchen) {
        super(name, birthday, salary, kitchen);
    }


    @Override
    public void Cook() {
        System.out.println(this.name + " got dirty hands, cooking done!");
    }
}
