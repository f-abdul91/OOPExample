package com.sparta;

public class Bird extends Animal implements Fly{
    private String name;
    public Bird(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void takeOff() {
        System.out.println("The " + getName() + " takes flight!");
    }
}