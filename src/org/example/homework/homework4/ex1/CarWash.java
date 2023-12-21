package org.example.homework.homework4.ex1;

public class CarWash  {
    private int costOfWashingCar;
    private int costOfWashingHollyCars;

    //маломерная машина моется машина моется
    public int automobileWashing(Car cityHollyPassengerCar) {
        if (cityHollyPassengerCar.isClean() || (cityHollyPassengerCar.getWidth() <= 6
                || cityHollyPassengerCar.getHeight() <= 2.5
                || cityHollyPassengerCar.getLength() <= 2)) {
            costOfWashingCar += 2000;
            cityHollyPassengerCar.setClean(true);
        }
        return costOfWashingCar;
    }

    //Автобусы моются
    //Маломерки моются
    public int automobileWashing(Car[][] cityHollyCars) {
        for (Car[] carsHolly : cityHollyCars) {
            for (Car cars : carsHolly) {
                if (cars.isClean() && (cars.getWidth() > 6
                        || cars.getHeight() > 2.5 || cars.getLength() > 2)) {
                    costOfWashingHollyCars += 4000;
                    cars.setClean(true);
                    //sout("Большине автобусы моются")
                } else {
                    costOfWashingHollyCars += 2000;
                    cars.setClean(true);
                    //sout("Маломерки моются")
                }
            }
        }
        return costOfWashingHollyCars;
    }

    public int getCostOfWashingCars() {
        return costOfWashingCar;
    }

    public int getCostOfWashingHollyCars() {
        return costOfWashingHollyCars;
    }
}