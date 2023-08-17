package com.brane.factorymethod;

class Dog implements Animal {
    @Override
    public String speak() {
        return "Woof!";
    }
}