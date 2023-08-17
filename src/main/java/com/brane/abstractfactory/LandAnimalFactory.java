package com.brane.abstractfactory;

class LandAnimalFactory implements AnimalFactory {
    @Override
    public Bird createBird() {
        return new Penguin();
    }

    @Override
    public Mammal createMammal() {
        return new Dog();
    }
}
