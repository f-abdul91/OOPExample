package com.sparta;

public class Reptile extends Animal{
    private String name;
    public Reptile(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void hiss(){
        System.out.println("The " + getName() + " hisses!");
    }
}