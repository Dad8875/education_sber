package ru.dad.task3_1.task5;

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] day = new DayOfWeek[7];
        for (int i = 0; i < day.length; i++) {
            day[i] = new DayOfWeek((byte) (i + 1));
        }

        for (DayOfWeek dayOfWeek : day) {
            System.out.println(dayOfWeek);
        }
    }
}
