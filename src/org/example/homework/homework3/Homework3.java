package org.example.homework.homework3;

import org.example.homework.homework3.factory.*;
import org.example.homework.homework3.pyramid.Piramid1;
import org.example.homework.homework3.pyramid.Piramid2;
import org.example.homework.homework3.pyramid.Piramid3;
import org.example.homework.homework3.tree.Birch;
import org.example.homework.homework3.tree.Pine;
import org.example.homework.homework3.tree.Spruce;
import org.example.homework.homework3.tree.Tree;

public class Homework3 {
    public static void main(String[] args) {
        //В этом дз уже будет проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
    }

    public static void ex1() {
        // pine; Сосна
        // birch; Береза
        // spruce; Ель
        Birch birch = new Birch(12, true);
        Pine pine = new Pine(23, "Крупный");
        Spruce spruce = new Spruce(32, "Мелкий");
        Tree[] trees = new Tree[]{birch, pine, spruce};
        int averageAge = 0;
        for (Tree tree : trees) {
            averageAge += tree.getAge();
        }
        System.out.println("ср.Возраст " + averageAge / 3);
        birch.leavesOnTree();



    }

    public static void ex2() {
//        assemblerSamsung.assemblingSamsung(galaxy, "Android", motherboard, "20x zoom");
//        assemblerSamsung.assemblingSamsung(model15, "Ios", motherboard, "15x zoom");
        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующих к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
        //камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.
        Iphone model15 = new Iphone("15");
        Samsung galaxy = new Samsung("galaxy");
        PhoneFactory factory = new PhoneFactory();
        Motherboard motherboardSamsung = new Motherboard("j-108", "10х12х13");
        Motherboard motherboardIphone = new Motherboard("7uik", "15х12х13");
        Motherboard[] motherboards = new Motherboard[]{motherboardIphone, motherboardSamsung};
        for (Motherboard motherboard : motherboards) {
            factory.assemblingSamsung(galaxy, "Android", motherboard, "20x zoom");
            factory.assemblingSamsung(model15, "Ios", motherboard, "15x zoom");
        }

    }

    public static void ex3() {
        Piramid1 piramid1 = new Piramid1("M", "MM", "MMM");
        Piramid2 piramid2 = new Piramid2("M", "MM", "MMM", "MM", "MMM");
        Piramid3 piramid3 = new Piramid3("M", "MM", "MMM",
                "M", "MM", "MMM");
        piramid1.print();

    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет
        //Создать класс лотерейный билет (у объекта не может быть атрибутов)
        //создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб,
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 100 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 100 билетов должна составить 6_000.
    }

    public static void ex5() {
        //Задача со звездочкой: иммутабельность города.
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //Создать два дома, создать город с массивом созданных городов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы
    }
}
