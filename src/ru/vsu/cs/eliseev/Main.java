package ru.vsu.cs.eliseev;

public class Main {

    public static void main(String[] args) {
        Animal a = new Cat();
        Coordinates c = new Coordinates(1, 2);
        System.out.println(a.talk());
        System.out.println(a.walk(new Direction(2, 5)));
        Cage<Swimming> pool = new Cage<>();
        Duck blackCloak = new Duck();
        pool.add(blackCloak);
        System.out.println(blackCloak.swim(new Direction(3, 5)));
        System.out.println(blackCloak.fly(new Direction(3, 5)));
        System.out.println(blackCloak.walk(new Direction(3, 5)));
        System.out.println(blackCloak.talk());
    }
}
