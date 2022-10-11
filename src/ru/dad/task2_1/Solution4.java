package ru.dad.task2_1;

import java.util.Scanner;

/*
4. Количество различных элементов
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо вывести на экран построчно сколько встретилось различных элементов.
Каждая строка должна содержать количество элементов и сам элемент через пробел.

Ограничение:
0 < N < 100
-1000 < ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
6
7 7 7 10 26 26

Пример выходных данных
3 7
1 10
2 26

 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] ai = new int[N];

        for (int i = 0; i < ai.length; i++) {
            ai[i] = scanner.nextInt();
        }
        int[] result = new int[N];
        int counter = 0;

        for (int i = 0; i < ai.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (ai[i] == ai[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                result[counter++] = ai[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            int count = 0;
            for (int j = 0; j < ai.length; j++) {
                if (result[i] == ai[j]) {
                    count++;
                }
            }
            System.out.println(count + " " + result[i]);
        }
    }
}
