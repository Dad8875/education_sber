package ru.dad.pm_2.pensum.task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Реализовать метод, который принимает массив words и целое положительное число k.
Необходимо вернуть k наиболее часто встречающихся слов..
Результирующий массив должен быть отсортирован по убыванию частоты
встречаемого слова. В случае одинакового количества частоты для слов, то
отсортировать и выводить их по убыванию в лексикографическом порядке.

Пример:

Входные данные                                     Выходные данные

words =
["the","day","is","sunny","the","the","the",      ["the","is","sunny","day"]
"sunny","is","is","day"]
k = 4
*/
public class Main {

    public static void main(String[] args) {
        String[] list = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day", "is", "is"};

        String[] strings = wordsInArray(list, 4);
        System.out.println(Arrays.toString(strings));
    }

    public static String[] wordsInArray(String[] words, int k) {
        String[] result = new String[k];
        Arrays.sort(words, (o1, o2) -> o2.compareTo(o1));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int i = 0;
        for (String s : map.keySet()) {
            result[i++] = s;
            if (i == k) {
                break;
            }
        }

        return result;
    }
}
