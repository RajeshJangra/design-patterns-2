package com.brane.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AnimalFactory landFactory = new LandAnimalFactory();
        Bird penguin = landFactory.createBird();
        Mammal dog = landFactory.createMammal();

        penguin.fly();
        dog.walk();

        AnimalFactory skyFactory = new SkyAnimalFactory();
        Bird sparrow = skyFactory.createBird();
        Mammal bat = skyFactory.createMammal();

        sparrow.fly();
        bat.walk();
    }
}
