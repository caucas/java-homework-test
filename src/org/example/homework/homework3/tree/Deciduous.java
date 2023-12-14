package org.example.homework.homework3.tree;

public abstract class Deciduous extends Tree {
    // Хвойные
    // Иглы
    protected boolean leavesOnTree;

    public Deciduous(int age, boolean leavesOnTree) {
        super(age);
        this.leavesOnTree = leavesOnTree;
    }

    public void leavesOnTree() {
        if (leavesOnTree == true) {
            System.out.println("есть листья на дереве сейчас, истояют аллергены");
        } else {
            System.out.println("лиcтьев нет");
        }
    }
}
