package ru.dad.task3_3.task1;

public class GoldFish extends Animal implements Swimming {
    @Override
    public void swim() {
        System.out.println("Рыбка плывет, хоть и не быстро");
    }

    @Override
    public void eat() {
        System.out.println("Рыбки тоже кушают");
    }

    @Override
    public void sleep() {
        System.out.println("А еще рыбки спят");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("Мать моя икринка!! И этим я горжусь");
    }
}
