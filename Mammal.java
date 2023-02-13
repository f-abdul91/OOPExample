package com.sparta;

public class Mammal extends Animal implements Swim{
    private String name;
    public Mammal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void swim() {
        System.out.println("The " + getName() + " swims");
    }
}