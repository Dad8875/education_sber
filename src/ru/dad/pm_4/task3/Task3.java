package ru.dad.pm_4.task3;

import java.util.List;

/*
3. На вход подается список строк. Необходимо вывести количество непустых строк в
списке.
Например, для List.of("abc", "", "", "def", "qqq") результат равен 3
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "", "def", "ggg", "java", "", "empty", "");
        System.out.println(list.stream().filter(s -> (!s.isEmpty())).count());
    }
}
