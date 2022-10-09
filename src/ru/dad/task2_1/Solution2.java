package ru.dad.task2_1;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Равенство массивов
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов.
После этого аналогично передается второй массив (aj) длины M.

Необходимо вывести на экран true, если два массива одинаковы
(то есть содержат одинаковое количество элементов и для каждого i == j элемент ai == aj).
Иначе вывести false.

Ограничение:
0 < N < 100
0 < ai < 1000
0 < M < 100
0 < aj < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
7
1 2 3 4 5 6 7
7
1 2 3 4 5 6 7

Пример выходных данных
true
 */
public class Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ai = new int[N];
        for (int i = 0; i < ai.length; i++) {
            ai[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] aj = new int[M];
        for (int i = 0; i < aj.length; i++) {
            aj[i] = scanner.nextInt();
        }

        System.out.println(Arrays.equals(ai, aj));
    }
}
