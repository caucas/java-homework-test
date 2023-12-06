package org.example.homework.homework2.office;

public class Office {
    String officeBossName;
    String managerName;
    String secretaryName;
    String guardName;

    public Office(String officeBossName, String managerName,
                  String secretaryName, String guardName) {
        this.officeBossName = officeBossName;
        this.managerName = managerName;
        this.secretaryName = secretaryName;
        this.guardName = guardName;
    }

    public void officeBoss() {
        System.out.println(managerName + " Быстрее!");
    }

    public void manager() {
        System.out.println(managerName + " Кричит: я ничего не успеваю, помогите!");
    }

    public void secretary() {
        System.out.println(officeBossName + " не волнуйтесь " + managerName
                + " все успеет. " + guardName + " - Подождите!");
    }

    public void guardName() {
        System.out.println(officeBossName + " я конечно все понимаю, но где мой аванс?");
    }


    public void workDay() {
        System.out.println(officeBossName + ": " + managerName + " Быстрее!");
        System.out.println(managerName + " Кричит: я ничего не успеваю, помогите!");
        System.out.println(secretaryName + ": " + officeBossName + " не волнуйтесь " + managerName
                + " все успеет. " + guardName + " - Подождите!");
        System.out.println(guardName + ": " + officeBossName + " я конечно все понимаю, но где мой аванс?");
    }
}
