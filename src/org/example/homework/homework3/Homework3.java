package org.example.homework.homework3;

import org.example.homework.homework3.ex2.*;
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
        Samsung samsung = new Samsung("galaxy");
        Iphone iphone = new Iphone(15);
        PhoneFactory factory = new PhoneFactory();
        factory.assemblingPhone(samsung);
        factory.assemblingPhone(iphone);
        System.out.println(samsung);
        System.out.println(iphone);

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
