package ru.vsu.cs.eliseev;

public class Main {

    public static void main(String[] args) {

        Animal a = new Cat();
        Coordinates c = new Coordinates(1, 2);
        System.out.println(a.talk());
        System.out.println(a.walk(new Direction(2, 5)));
    }
}
