package com.brane.factorymethod;

public class Client {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        Animal dog = dogFactory.createAnimal();
        Animal cat = catFactory.createAnimal();

        System.out.println(dog.speak());
        System.out.println(cat.speak());
    }
}
