package org.example.homework.homework2.shop;

import java.util.Arrays;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item("Hammer", 1000);
        Item screwdriver = new Item("Screwdriver", 50);
        Item notebook = new Item("Notebook", 30);
        Item pen = new Item("Pen", 10);
        Item[] itemsVasiliy = new Item[]{hammer, screwdriver};
        Item[] itemsMariana = new Item[]{notebook, pen};
        Worker vasiliy = new Worker("Vasiliy", "Man", 30, itemsVasiliy);
        Worker mariana = new Worker("Mariana", "Girl", 25, itemsMariana);
        Worker[] workerNames = new Worker[]{vasiliy, mariana};
        Shop shopWorkers = new Shop(workerNames);
        vasiliy.speak();
        mariana.speak();
        shopWorkers.boast();
    }
}
