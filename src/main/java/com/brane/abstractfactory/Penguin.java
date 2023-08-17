package com.brane.abstractfactory;

class Penguin implements Bird {
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly though it is a bird.");
    }
}
