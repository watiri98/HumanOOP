package com.example.humanoop;

import android.util.Log;

public class Human{
    public String name;
    public int weight;
    public int age;

    public Human(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        Log.d("Human","I am eating food");
    }
    public void sleep(){
        Log.d("Human","zzzzzzzz");
    }
    public int sleep(int hours){
        return    Log.d("Human","I am sleeping for x hours");
    }
    public void speak (String speech){
        Log.d("Human","I will be coming tomorrow");
    }
    public int birthday(){
        age = age + 1;
        return age;
    }
}

