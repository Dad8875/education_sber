package ru.dad.task3_1.task1;
/*
1. Необходимо реализовать класс Cat.
У класса должны быть реализованы следующие приватные методы:
● sleep() — выводит на экран “Sleep”
● meow() — выводит на экран “Meow”
● eat() — выводит на экран “Eat”
И публичный метод:
status() — вызывает один из приватных методов случайным образом.

 */
public class Cat {
    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        int a = (int)(Math.random() * (4 - 1)) + 1;
        switch (a) {
            case 1:
                sleep();
                break;
            case 2:
                meow();
                break;
            case 3:
                eat();
                break;
            default:
                System.out.println("Что то пошло не так ....");
        }
    }
}
