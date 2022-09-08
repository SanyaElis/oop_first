package ru.vsu.cs.eliseev;

public class Cat extends Animal {

    @Override
    String talk() {
        return "Meow";
    }

    public Cat() {
        super(new Coordinates(0, 0));
    }
}
