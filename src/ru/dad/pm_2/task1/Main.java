package ru.dad.pm_2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
1. Реализовать метод, который на вход принимает ArrayList<T>, а возвращает
набор уникальных элементов этого массива. Решить используя коллекции.
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(12, 45, 23, 6, 12, 78, 23, 5, 55));
        System.out.println(uniqueElement(integers));
    }

    public static <T> HashSet uniqueElement(ArrayList<T> list) {
        return new HashSet(list);
    }
}
