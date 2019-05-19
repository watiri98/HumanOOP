package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {
    private int height;

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
        weight = weight + 2;

  }
  @Override
    public int birthday() {
      age = age + 4;
      return age;

  }




    }




