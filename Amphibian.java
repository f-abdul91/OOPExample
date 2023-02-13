package com.sparta;

public class Amphibian extends Animal implements Swim{
    private String name;

    public Amphibian(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public void swim() {
        System.out.println("The " + getName() + " dives");
    }
}
