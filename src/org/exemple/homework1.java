package org.exemple;

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
        //int neckProduced = 6988;
        // Продано Колбасы 2000кг
        //         Ветчины 8511кг
        //         Шейки 6988кг
        int sausageSell = 2000;
        int hamSell = 8511;
        int neckSell = 6988;
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб
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



        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб
        int hamPrice = 350;
        int costOfHamProduction = 275;
        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб
        int neckPrice = 500;
        int neckProduced = 6988;
        int costOfNeckProduction = 0;
        if (neckProduced < 500) {
            costOfNeckProduction = 412;
        }
        if (neckProduced >= 500) {
            costOfNeckProduction = 290;
        }
        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг

        int incomeForSausage = sausagePrice * sausageSell;
        int incomeForHam = hamPrice * hamSell;
        int incomeForNeck = neckPrice * neckSell;
        int incomeCompany = incomeForNeck + incomeForHam + incomeForNeck;
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        int consumptionForSausage = costOfSausageProduction * sausageSell;
        int consumptionForHam = costOfHamProduction * hamSell;
        int consumptionForNeck = costOfNeckProduction * neckSell;
        int consumptionForCompany = consumptionForSausage + consumptionForHam + consumptionForNeck + 1_000_000;

        //Прибыль до налогов считается как: доход - расход
         int profitBeforeTaxes = incomeCompany - consumptionForCompany;

        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        double companyProfitWithTax = 0;
        if (incomeCompany > 2_000_000) {
            companyProfitWithTax = incomeCompany * 0.13;
        }if (incomeCompany > 1_000_000 & incomeCompany <2_000_000) {
            companyProfitWithTax = incomeCompany * 0.1;
        }if (incomeCompany < 1_000_000) {
            companyProfitWithTax = incomeCompany * 0.08;
        }


        //Прибыль после налогов: прибыль до налогов - налог.
        double profitAfterTaxes = profitBeforeTaxes - companyProfitWithTax;
        System.out.println(profitAfterTaxes);
        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг
    }

}
