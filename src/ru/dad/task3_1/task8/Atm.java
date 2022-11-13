package ru.dad.task3_1.task8;

/**
 * 8. Реализовать класс “банкомат” Atm.
 * Класс должен:
 * ● Содержать конструктор, позволяющий задать курс валют перевода
 * долларов в рубли и курс валют перевода рублей в доллары (можно
 * выбрать и задать любые положительные значения)
 * ● Содержать два публичных метода, которые позволяют переводить
 * переданную сумму рублей в доллары и долларов в рубли
 * ● Хранить приватную переменную счетчик — количество созданных
 * инстансов класса Atm и публичный метод, возвращающий этот счетчик
 * (подсказка: реализуется через static)
 */
public class Atm {
    private double dollarBuy;
    private double dollarsSell;
    private static int countInstance = 0;

    public Atm(double dollarBuy, double dollarsSell) {
        if (dollarBuy > 0 && dollarsSell > 0) {
            this.dollarBuy = dollarBuy;
            this.dollarsSell = dollarsSell;
        } else {
            System.out.println("Только больше нуля!");
        }
        countInstance++;
    }

    public static int getCountInstance() {
        return countInstance;
    }

    public double converseRoublesInDollars(double roubles) {
        if (roubles > 0 && dollarsSell > 0) {
            return (int) ((roubles / dollarsSell) * 100) / 100.0;
        } else {
            return -1.0;
        }
    }

    public double converseDollarsInRoubles(double dollars) {
        if (dollars > 0 && dollarBuy > 0) {
            return (int) ((dollars * dollarBuy) * 100) / 100.0;
        } else {
            return -1.0;
        }
    }
}
