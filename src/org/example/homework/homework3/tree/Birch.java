package org.example.homework.homework3.tree;

public class Birch extends Deciduous {
    //Береза


    public Birch(int age, boolean leavesOnTree) {
        super(age, leavesOnTree);
    }

    @Override
    public void leavesOnTree() {
        super.leavesOnTree();
        if (leavesOnTree == true) {
            System.out.println("источает аллергены");
        }
    }
}
