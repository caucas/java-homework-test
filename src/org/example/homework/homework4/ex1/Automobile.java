package org.example.homework.homework4.ex1;

public class Automobile extends Car {
    protected final boolean cruiseControl;

    public Automobile(boolean clean, int width, int height, double length, boolean cruiseControl) {
        super(clean, width, height, length);
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "Automobile{"
                + "cruiseControl="
                + cruiseControl
                + '}';
    }


}
