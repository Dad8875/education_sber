package ru.dad.task3_3.task1;

public class Bat extends Animal implements Flying {

    @Override
    public void eat() {
        System.out.println("Летучий мышь кушает");
    }

    @Override
    public void sleep() {
        System.out.println("Мышь спит. Не беспокоить!!!");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("Какое еще яйцо ? Меня мама родила, сама !!!!");
    }

    @Override
    public void fly() {
        System.out.println("Летаю низко и не быстро, но летаю же !!!!");
    }
}
