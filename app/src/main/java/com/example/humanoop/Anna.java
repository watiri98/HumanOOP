package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {
    private int height;
    public Anna(String name, int weight, int age) {
        super(name, weight, age);
    }

    public Anna(String name, int weight, int age, int height) {
        super(name, weight, age);
        this.height = height;
    }





    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
  @Override
    public void eat () {
        super.eat();
        int annaWeight = getWeight();
        annaWeight = annaWeight + 2;
        setWeight(annaWeight);
  }

    @Override
    public void birthday() {
        int annaAge = getAge();
        annaAge = annaAge + 4;
        setAge(annaAge);
    }
}









