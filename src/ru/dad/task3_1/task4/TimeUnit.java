package ru.dad.task3_1.task4;

/**
 * 4. Необходимо реализовать класс TimeUnit с функционалом, описанным ниже
 * (необходимые поля продумать самостоятельно). Обязательно должны быть
 * реализованы валидации на входные параметры.
 * <p>
 * Конструкторы:
 * ● Возможность создать TimeUnit, задав часы, минуты и секунды.
 * ● Возможность создать TimeUnit, задав часы и минуты. Секунды тогда
 * должны проставиться нулевыми.
 * ● Возможность создать TimeUnit, задав часы. Минуты и секунды тогда
 * должны проставиться нулевыми.
 * Публичные методы:
 * ● Вывести на экран установленное в классе время в формате hh:mm:ss
 * ● Вывести на экран установленное в классе время в 12-часовом формате
 * (используя hh:mm:ss am/pm)
 * ● Метод, который прибавляет переданное время к установленному в
 * TimeUnit (на вход передаются только часы, минуты и секунды).
 */
public class TimeUnit {
    private int hours;
    private int minute;
    private int second;

    public TimeUnit(int hours, int minute, int second) {
        this(hours, minute);
        if (second >= 0 && second <= 60) {
            this.second = second;
        } else {
            System.out.println("Некорректные данные!");
        }

    }

    public TimeUnit(int hours, int minute) {
        this(hours);
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else {
            System.out.println("Некорректные данные!");
        }
        second = 0;
    }

    public TimeUnit(int hours) {
        if (hours >= 0 && hours <= 24) {
            this.hours = hours;
        } else {
            System.out.println("Некорректные данные!");
        }
        minute = 0;
        second = 0;
    }

    public void printTime() {
        System.out.println(hours + ":" + minute + ":" + second);
    }

    public void printTimeAmFormat() {
        String str = "";
        if (hours > 12) {
            hours -= 12;
            str = "PM";
        } else {
            str = "AM";
        }
        System.out.println(hours + ":" + minute + ":" + second + " " + str);
    }

    public void addTime(int hours, int minute, int second) {
        int currentSecondTIme = this.hours * 3600 + this.minute * 60 + this.second;
        int newSecondTime = hours * 3600 + minute * 60 + second + currentSecondTIme;
        this.hours = newSecondTime / 3600;
        this.minute = newSecondTime / 60 % 60;
        this.second = newSecondTime % 60;
    }
}
