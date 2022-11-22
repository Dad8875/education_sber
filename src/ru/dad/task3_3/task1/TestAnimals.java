package ru.dad.task3_3.task1;
/*
Имеется следующий набор утверждений.
1. Рассматриваются следующие животные:
● летучая мышь (Bat)
● дельфин (Dolphin)
● золотая рыбка (GoldFish)
● орел (Eagle)
Все животные одинаково едят и спят (предположим), и никто из животных не
должен иметь возможности делать это иначе.
Еще животные умеют по-разному рождаться (wayOfBirth):
● Млекопитающие (Mammal) живородящие.
● Рыбы (Fish) мечут икру.
● Птицы (Bird) откладывают яйца.
Помимо этого бывают некоторые особенности, касающиеся передвижения.
Бывают летающие животные (Flying) и плавающие (Swimming). Однако орел
летает быстро, а летучая мышь медленно. Дельфин плавает быстро, а золотая
рыбка медленно.
Согласно этим утверждениям нужно создать иерархию, состоящую из классов,
абстрактных классов и/или интерфейсов. Каждое действие или утверждение
подразумевает под собой вызов void метода, в котором реализован вывод на
экран описания текущего действия.
*/
public class TestAnimals {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.eat();
        eagle.sleep();
        eagle.wayOfBirth();
        System.out.println("----------------->>");
        Bat bat = new Bat();
        bat.wayOfBirth();
        bat.sleep();
        bat.eat();
        bat.fly();
        System.out.println("----------------->>");
        GoldFish fish = new GoldFish();
        fish.eat();
        fish.sleep();
        fish.swim();
        fish.wayOfBirth();
        System.out.println("----------------->>");
        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.swim();
        dolphin.sleep();
        dolphin.wayOfBirth();
    }
}
