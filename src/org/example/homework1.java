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
        name.trim();
        name.toUpperCase();

        if (name.contains("ова")) {
            System.out.printf("Уважаемая", name);
        }else if (name.contains("ов")) {
            System.out.printf("Уважаемый", name);
        }else {
            System.out.printf("Неизвестное лицо");
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

        if (fuel >= 10 && (isWheelWork1 & isWheelWork2 & isWheelWork3 & isWheelWork4)
                && !hasErrors & isEngineWork
        ) {
            System.out.println("\nМашина работает");
        } else {
            System.out.println("\nМашина не работает");
        }
    }
    public static void ex3(){

        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are");
        simply = simply.replace("This is", "Those are");
        int indexSimply = simply.lastIndexOf(("o"));
        System.out.println(indexSimply);
    }
    public static void ex4() {
        int sausageProduced = 2000;
        int hamProduced = 8511;
        int neckProduced = 6988;

        int sausageSell = 2000;
        int hamSell = 8511;
        int neckSell = 6988;

        int sausagePrice = 800;
        int costOfSausageProduction = 0;
        if (sausageProduced < 1000) {
            costOfSausageProduction = 412;
        }

        if (sausageProduced >= 1000 & sausageProduced < 2000) {
            costOfSausageProduction = 404;
        }
        if (sausageProduced >= 2000) {
            costOfSausageProduction = 404;
        }

        int hamPrice = 350;
        int costOfHamProduction = 275;

        int neckPrice = 500;
        int costOfNeckProduction = 0;
        if (neckProduced < 500) {
            costOfNeckProduction = 412;
        }
        if (neckProduced >= 500) {
            costOfNeckProduction = 290;
        }
        //Финансовые показатели
        int incomeForSausage = sausagePrice * sausageSell;
        int incomeForHam = hamPrice * hamSell;
        int incomeForNeck = neckPrice * neckSell;
        int incomeCompany = incomeForNeck + incomeForHam + incomeForNeck;

        int consumptionForSausage = costOfSausageProduction * sausageSell;
        int consumptionForHam = costOfHamProduction * hamSell;
        int consumptionForNeck = costOfNeckProduction * neckSell;
        int consumptionForCompany = consumptionForSausage + consumptionForHam + consumptionForNeck + 1_000_000;

        int profitBeforeTaxes = incomeCompany - consumptionForCompany;

        double companyProfitWithTax = 0;
        if (incomeCompany > 2_000_000) {
            companyProfitWithTax = incomeCompany * 0.13;
        }if (incomeCompany > 1_000_000 & incomeCompany <2_000_000) {
            companyProfitWithTax = incomeCompany * 0.1;
        }if (incomeCompany < 1_000_000) {
            companyProfitWithTax = incomeCompany * 0.08;
        }

        double profitAfterTaxes = profitBeforeTaxes - companyProfitWithTax;
        System.out.println(profitAfterTaxes);
    }

}
