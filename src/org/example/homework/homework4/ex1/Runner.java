package org.example.homework.homework4.ex1;


public class Runner {
    public static void main(String[] args) {
        Car[] cityHollyPassengerCars = {
            new Automobile(false, 5, 2, 1.8, true),
            new Automobile(false, 5, 2, 1.8, true),
            new Automobile(false, 5, 2, 1.8, true),
            new Automobile(false, 5, 2, 1.8, true)};
        Car[] cityHollyBus = {new Bus(false, 13, 3, 2.3, 12),
            new Bus(false, 13, 3, 2.3, 32),
            new Bus(false, 13, 3, 2.3, 32),
            new Bus(false, 13, 3, 2.3, 44),
            new Bus(false, 13, 3, 2.3, 53)};

        Car[][] cityHollyCars = new Car[][]{cityHollyPassengerCars, cityHollyBus};
        CarWash carWash = new CarWash();
        carWash.automobileWashing(cityHollyPassengerCars[0]);
        carWash.automobileWashing(cityHollyCars);
        System.out.println("Стоимость мойки одной машины составила: "
                + carWash.getCostOfWashingCars() + " Rub");
        System.out.println("_________________________________________");
        System.out.print("Стоимость мойки всех машин составила: "
                + carWash.getCostOfWashingHollyCars() + " Rub");
    }
}
