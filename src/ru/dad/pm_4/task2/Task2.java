package ru.dad.pm_4.task2;

import java.util.List;

/*
2. На вход подается список целых чисел. Необходимо вывести результат перемножения
этих чисел.
Например, если на вход передали List.of(1, 2, 3, 4, 5), то результатом должно быть число
120 (т.к. 1 * 2 * 3 * 4 * 5 = 120).

 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().reduce(1, (a, b) -> a * b));
    }
}
