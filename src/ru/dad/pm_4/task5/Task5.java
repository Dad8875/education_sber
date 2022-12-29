package ru.dad.pm_4.task5;

import java.util.List;

/*
5. На вход подается список непустых строк. Необходимо привести все символы строк к
верхнему регистру и вывести их, разделяя запятой.
Например, для List.of("abc", "def", "qqq") результат будет ABC, DEF, QQQ.
*/
public class Task5 {
    public static void main(String[] args) {
        List<String> list = List.of("cat", "java", "dog", "piper", "stack");
        list.stream()
                .map(String::toUpperCase)
                .forEach(s -> {
                    if (s.equalsIgnoreCase(list.get(list.size() - 1))) {
                        System.out.print(s + ".");
                    } else {
                        System.out.print(s + ", ");
                    }
                });
    }
}
