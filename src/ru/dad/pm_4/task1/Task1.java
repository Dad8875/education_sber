package ru.dad.pm_4.task1;

import java.util.ArrayList;
import java.util.List;

/*
1. Посчитать сумму четных чисел в промежутке от 1 до 100 включительно и вывести ее на
экран.
*/
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        int sum = list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
