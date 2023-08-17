package com.brane.abstractfactory;

class Dog implements Mammal {
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }
}
