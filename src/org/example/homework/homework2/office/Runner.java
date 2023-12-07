package org.example.homework.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Workers officeBoss = new Workers("Петр Николаевич");
        Workers manager = new Workers("Володя");
        Workers guard = new Workers("Петрович");
        Workers secretary = new Workers(null);
        Workers[] officeWorkers = new Workers[]{officeBoss, manager, guard, secretary};
        Office workersMassive = new Office(officeWorkers);

        //workersMassive.bossMotivation();
        //workersMassive.managerAskHelp();
        //workersMassive.guardAskAvance();
        //workersMassive.secretarySpeaks();
        workersMassive.workDay();
    }
}
