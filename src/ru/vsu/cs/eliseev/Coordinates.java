package ru.vsu.cs.eliseev;

public class Coordinates {
    final int x;
    final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Coordinates move(Direction dir){
        return new Coordinates(x + dir.x, y + dir.y);
    }

    Coordinates move(Direction dir, double k){
        return new Coordinates((int) (x + dir.x * k), (int) (y + dir.y * k));
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
