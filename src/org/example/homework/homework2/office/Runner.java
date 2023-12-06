package org.example.homework.homework2.office;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Office officeWorkers = new Office("Petr Nicolaevich",
                "Voloda", null, "Petrovich");

        officeWorkers.officeBoss();
        officeWorkers.manager();
        officeWorkers.secretary();
        officeWorkers.guardName();
        System.out.println("\n");
        officeWorkers.workDay();

    }
}
