package org.example.homework.homework3.tree;

public abstract class Conifers extends Tree {
    //Лиственные
    protected String needles;

    protected Conifers(int age, String needles) {
        super(age);
        this.needles = needles;
    }
}
