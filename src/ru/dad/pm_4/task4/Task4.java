package ru.dad.pm_4.task4;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
4. На вход подается список вещественных чисел. Необходимо отсортировать их по
убыванию.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Double> list = List.of(45.7, 23.4, 12.0, 22.8, 2.8, 56.9, 12.5, 61.4, 7.0);
        List<Double> collect = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
