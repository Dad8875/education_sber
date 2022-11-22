package ru.dad.task3_3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3. На вход передается N — количество столбцов в двумерном массиве и M —
количество строк. Необходимо вывести матрицу на экран, каждый элемент
которого состоит из суммы индекса столбца и строки этого же элемента. Решить
необходимо используя ArrayList.
Ограничения:
● 0 < N < 100
● 0 < M < 100
Пример:
Входные данные Выходные данные
2 2             0 1
                1 2

3 5             0 1 2
                1 2 3
                2 3 4
                3 4 5
                4 5 6
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list2.add(i);
        }

        for (Integer integer : list1) {
            for (Integer integer1 : list2) {
                System.out.print((integer + integer1) + " ");
            }
            System.out.println();
        }
    }
}
