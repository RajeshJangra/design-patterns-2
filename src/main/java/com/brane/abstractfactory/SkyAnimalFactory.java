package com.brane.abstractfactory;

class SkyAnimalFactory implements AnimalFactory {
    @Override
    public Bird createBird() {
        return new Sparrow();
    }

    @Override
    public Mammal createMammal() {
        return new Bat();
    }
}
