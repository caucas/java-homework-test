package org.example.homework.homework4.ex2;

public class Duck implements Flyable {
    private final boolean injury;

    public Duck(boolean  injury) {
        this.injury = injury;
    }

    @Override
    public void fly() throws FlyException {
        if (!isInjury()) {
            throw new FlyException("Ошибка: утка не летит");
        }  else {
            System.out.println("Утка летит");
        }
    }

    public boolean isInjury() {
        return injury;
    }
}
