package ru.dad.task3_3.task1;

public class Dolphin extends Animal implements Swimming {
    @Override
    public void swim() {
        System.out.println("Дельфины быстро плавают хоть и не рыбы");
    }

    @Override
    public void eat() {
        System.out.println("Рыбов хочу ......ем я их!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Спят усталые дельфины....");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("Да не рыбы мы, какая икра ? Мама нас рожает.... ");
    }
}
