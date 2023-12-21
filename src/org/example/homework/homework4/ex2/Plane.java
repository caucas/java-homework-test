package org.example.homework.homework4.ex2;

public class Plane implements Flyable {
    protected int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (getCountPassengers() < 0) {
            throw new FlyException("Ошибка: самолет не летит");
        }
        System.out.println("Самолет летит");
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}

