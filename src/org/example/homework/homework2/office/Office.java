package org.example.homework.homework2.office;

import org.example.homework.homework2.shop.Worker;

public class Office {
    Workers[] officeWorkers;

    public Office(Workers[] officeWorkers) {
        this.officeWorkers = officeWorkers;
    }

    public void bossMotivation() {
        System.out.println(officeWorkers[1].workersName + " быстрее!");
    }

    public void managerAskHelp() {
        System.out.println("Я ничего не успеваю, помогите!");
    }

    public void guardAskAvance() {
        System.out.println("Дайте аванс пожалуйста");
    }

    public void secretarySpeaks() {
        //for (Workers worker : officeWorkers)
        System.out.println(officeWorkers[0].workersName + " Не волнуйтесь, "
                + officeWorkers[1].workersName + " Все успеет. "
                + officeWorkers[2].workersName + " - подождите!");
    }

    public void workDay() {
        System.out.println(officeWorkers[0].workersName + ": "
                + officeWorkers[1].workersName + " быстрее!");
        System.out.println(officeWorkers[1].workersName + ": " + "Я ничего не успеваю, помогите!");
        System.out.println(officeWorkers[0].workersName + ": " + "Дайте аванс пожалуйста");
        System.out.println(officeWorkers[3].workersName + ": " + officeWorkers[0].workersName
                + " не волнуйтесь, " + officeWorkers[1].workersName + " все успеет. "
                + officeWorkers[2].workersName + " - подождите!");
    }
}
