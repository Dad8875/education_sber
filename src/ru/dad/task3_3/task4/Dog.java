package ru.dad.task3_3.task4;

public class Dog {
    private final String name;
    private final String nameOwner;

    public Dog(String name, String nameOwner) {
        this.name = name;
        this.nameOwner = nameOwner;
    }

    @Override
    public String toString() {
        return name + ": " + nameOwner;
    }
}
