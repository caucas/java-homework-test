package org.example.homework.homework4.ex1;

public class Bus extends Car {
    protected   int maxPassengers;

    public Bus(boolean clean, double width, double height, double length, int maxPassengers) {
        super(clean, width, height, length);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Bus{"
                + "maxPassengers=" + maxPassengers
                + '}';
    }
}
