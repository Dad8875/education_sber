package ru.dad.task3_3.task1;

public class Eagle extends Animal implements Flying {
    @Override
    public void eat() {
        System.out.println("Орел кушает");
    }

    @Override
    public void sleep() {
        System.out.println("Орел спит");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("Только настоящие орлы вылупляются из яиц!!!");
    }

    @Override
    public void fly() {
        System.out.println("Орел летает высоко и быстро");
    }
}
