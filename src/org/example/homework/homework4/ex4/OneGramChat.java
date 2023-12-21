package org.example.homework.homework4.ex4;

import java.util.Scanner;

public class OneGramChat {

    public void newUserName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        if (in.hasNextLine()) {
            String name = in.nextLine();
            System.out.printf("Ваше имя %s \n", name);
        }
    }

    public void userPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль");
        if (in.hasNextInt()) {
            int password = in.nextInt();
            System.out.printf("Ваш пароль %s", password);
        }
    }
}
