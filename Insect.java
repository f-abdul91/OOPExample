package com.sparta;

public class Insect extends Animal implements Fly{
    private String name;
    public Insect(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public void takeOff() {
        System.out.println("The " + getName() + "takes flight!");
    }
}
