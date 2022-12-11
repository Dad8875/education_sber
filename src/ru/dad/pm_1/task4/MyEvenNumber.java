package ru.dad.pm_1.task4;

/*
4. Создать класс MyEvenNumber, который хранит четное число int n. Используя
исключения, запретить создание инстанса MyPrimeNumber с нечетным числом.
*/
public class MyEvenNumber {
    private int n;

    public MyEvenNumber(int n) throws Exception {
        if (n % 2 == 0) {
            this.n = n;
        } else {
            throw new Exception("Только четные числа !!!");
        }
    }

    public int getN() {
        return n;
    }
}
