package com.codecool.restaurant;

public abstract class CanCook extends Employee{
    boolean hasKnife;

    public CanCook(String name, String birthday, Float salary, Kitchen kitchen) {
        super(name, birthday, salary, kitchen);
        this.hasKnife=false;
    }

    public abstract void Cook();

    void getKnife(){
        if (!this.hasKnife) {
            System.out.println(this.name + " gets his knife!" );
            this.hasKnife=true;
        }
    }
}
