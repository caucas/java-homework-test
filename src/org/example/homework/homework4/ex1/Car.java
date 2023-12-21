package org.example.homework.homework4.ex1;

public abstract class Car {
    protected boolean clean;
    private final double width;
    private final double height;
    private final double length;


    public Car(boolean clean, double width, double height, double length) {
        this.clean = clean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Car{"
                + "clean=" + clean
                + ", width=" + width
                + ", height=" + height
                + ", length=" + length
                + '}';
    }
}
