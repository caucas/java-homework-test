package org.example;

public class homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }
    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.trim();

        name = name.toUpperCase();

        if (name.contains("ОВА")) {
            System.out.printf("Уважаемая", name);
        }else if (name.contains("ОВ")) {
            System.out.printf("Уважаемый", name);
        }else {
            System.out.println("Неизвестное лицо");
        }
    }
    public static void ex2(){

        double fuel = 11;

        boolean isEngineWork = true;

        boolean hasErrors = false;

        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10 && (isWheelWork1 & isWheelWork2 & isWheelWork3 & isWheelWork4) && !hasErrors & isEngineWork) {
            System.out.println("\nМашина работает");
        } else {
            System.out.println("\nМашина не работает");
        }
    }
    public static void ex3(){

        String simply = "this is simply. This is my favorite song.";

        simply = simply.replace("this is", "those are");

        simply = simply.replace("This is", "Those are");

        int indexSimply = simply.indexOf("o", 3);
        System.out.println(indexSimply);
    }
    public static void ex4() {
        //Сколько произведение
        int sausageProduced = 2000;
        int hamProduced = 8511;
        int neckProduced = 6988;
        //Входные данные, сколько продано
        int sausageSell = 2000;
        int hamSell = 8511;
        int neckSell = 6988;
        //Цена продажи
        int sausagePrice = 800;
        //Считаем себестоимость
        int costOfSausageProduction = 0;
        if (sausageProduced < 1000) {
            costOfSausageProduction = 412;
        }else if (sausageProduced >= 1000 & sausageProduced < 2000) {
            costOfSausageProduction = 404;
        }else if (sausageProduced >= 2000) {
            costOfSausageProduction = 404;
        }
        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб
        int hamPrice = 350;
        int costOfHamProduction = 275;
        //Шейка - стоимость 500 руб
        //Считаем себестоимость
        int neckPrice = 500;
        int costOfNeckProduction = 0;
        if (neckProduced < 500) {
            costOfNeckProduction = 412;
        }else if (neckProduced >= 500) {
            costOfNeckProduction = 290;
        }
        //Финансовые показатели
        //Доход компании
        int incomeForSausage = sausagePrice * sausageSell;
        int incomeForHam = hamPrice * hamSell;
        int incomeForNeck = neckPrice * neckSell;
        int incomeCompany = incomeForNeck + incomeForHam + incomeForNeck;
        //Расход компании
        int consumptionForSausage = costOfSausageProduction * sausageSell;
        int consumptionForHam = costOfHamProduction * hamSell;
        int consumptionForNeck = costOfNeckProduction * neckSell;
        int consumptionForCompany = consumptionForSausage + consumptionForHam + consumptionForNeck + 1_000_000;
        //Прибыль до налогов
        int profitBeforeTaxes = incomeCompany - consumptionForCompany;
        //Считаем сколько налогов платим
        double incomeTax = 0;
        if (incomeCompany > 2_000_000) {
            incomeTax = incomeCompany * 0.13;
        }else if (incomeCompany > 1_000_000 & incomeCompany <2_000_000) {
            incomeTax = incomeCompany * 0.1;
        }else if (incomeCompany < 1_000_000) {
            incomeTax = incomeCompany * 0.08;
        }
        //Прибыль после вычета налогов.
        double profitAfterTaxes = profitBeforeTaxes - incomeTax;
        System.out.println(profitAfterTaxes);
    }

}
