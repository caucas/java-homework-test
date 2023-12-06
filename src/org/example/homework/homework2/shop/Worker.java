package org.example.homework.homework2.shop;

import java.util.Arrays;
import javax.swing.plaf.PanelUI;


public class Worker {
    String name;
    int age;
    String gender;
    Item[] massiveItems;

    public Worker(String name, String gender, int age, Item[] massiveItems) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.massiveItems = massiveItems;
    }

    public void speak() {
        for (Item workerItem : massiveItems) {
            System.out.println(name + " ОРЕТ" + ":" + " Смотрите какая у меня вещь: "
                    + workerItem.itemName);
        }
    }
}
