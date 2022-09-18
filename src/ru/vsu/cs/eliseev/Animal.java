package ru.vsu.cs.eliseev;

abstract class Animal {//класс для наследования (Abstract) экземпляры данного класса не создаются
    protected Coordinates position;


    public Animal(Coordinates position) {
        this.position = position;
    }

    Coordinates walk(Direction dir) {
        this.position = position.move(dir);
        return position;
    }

    abstract String talk();
}
