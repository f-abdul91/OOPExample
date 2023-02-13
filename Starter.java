package com.sparta;

public class Starter {
    static void start(){
        Mammal roger = new Carnivore("Dog");
        roger.swim();

        Reptile larry = new Squamates("Snake");
        larry.hiss();

        System.out.println(larry.getName());

        Bird mary = new Owl("Barn owl");
        mary.takeOff();


    }
}
