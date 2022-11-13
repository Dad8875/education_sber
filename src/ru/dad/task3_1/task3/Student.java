package ru.dad.task3_1.task3;

/**
 * 2. Необходимо реализовать класс Student.
 * У класса должны быть следующие приватные поля:
 * ● String name — имя студента
 * ● String surname — фамилия студента
 * ● int[] grades — последние 10 оценок студента. Их может быть меньше, но
 * не может быть больше 10.
 * И следующие публичные методы:
 * ● геттер/сеттер для name
 * ● геттер/сеттер для surname
 * ● геттер/сеттер для grades
 * ● метод, добавляющий новую оценку в grades. Самая первая оценка
 * должна быть удалена, новая должна сохраниться в конце массива (т.е.
 * массив должен сдвинуться на 1 влево).
 * ● метод, возвращающий средний балл студента (рассчитывается как
 * среднее арифметическое от всех оценок в массиве grades)
 */

public class Student {
    private String name;
    private String surName;
    private int[] grades;


    public Student(String name, String surName, int[] grades) {
        this.name = name;
        this.surName = surName;
        if (grades.length <= 10) {
            this.grades = grades;
        } else {
            System.out.println(" Не более 10-ти оценок!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addScore(int score) {
        grades[0] = score;
        for (int i = 1; i < grades.length; i++) {
            grades[i - 1] = grades[i];
        }
        grades[grades.length - 1] = score;
    }

    public double averageScore() {
        double result = 0.0;
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
        }
        return result / grades.length;
    }
}
