package com.codecool.restaurant;

public abstract class Employee {
    String name;
    String birthday;
    Float salary;
    Kitchen kitchen;

    void getTaxReport(){
        System.out.println(this.salary*0.99f);
    }

    public Employee(String name, String birthday, Float salary, Kitchen kitchen) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.kitchen = kitchen;

    }
}
