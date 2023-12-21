package org.example.homework.homework4.ex2;

public class Runner {
    public static void main(String[] args) throws Exception {
        Duck duck = new Duck(true);
        Duck duck1 = new Duck(false);
        Plane plane = new Plane(10);
        Plane plane1 = new Plane(-1);

        Flyable[] flyables = {duck, duck1, plane, plane1};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException flyException) {
                System.out.println(flyException.getMessage());
            }
        }
    }
}
