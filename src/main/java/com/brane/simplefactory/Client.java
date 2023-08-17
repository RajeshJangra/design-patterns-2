package com.brane.simplefactory;

public class Client {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");

        System.out.println(dog.speak());
        System.out.println(cat.speak());
    }
}
