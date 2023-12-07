package org.example.homework.homework2.shop;

public class Shop {
    Worker[] shopWorkers;

    public Shop(Worker[] shopWorkers) {
        this.shopWorkers = shopWorkers;
    }

    public void boast() {
        for (Worker workerBoast : shopWorkers) {
            for (int i = 0; i < 2; i++) {
                System.out.println(workerBoast.name + ", " + workerBoast.age
                        + " Лет, " + workerBoast.gender + ": ХАХА, Смотрите что у меня есть: "
                        + workerBoast.massiveItems[i].itemName);
            }
        }
    }
}
