package com.brane.abstractfactory;

class Bat implements Mammal {
    @Override
    public void walk() {
        System.out.println("Bat doesn't walk though it is mammal but it flies");
    }
}
