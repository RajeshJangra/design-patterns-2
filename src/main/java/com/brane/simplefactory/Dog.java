package com.brane.simplefactory;

class Dog implements Animal {
    @Override
    public String speak() {
        return "Woof!";
    }
}