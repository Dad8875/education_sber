package ru.dad.task2_1;

import java.util.Arrays;
import java.util.Scanner;

/*
5. Сдвиг
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов.
После этого передается число M — величина сдвига.

Необходимо циклически сдвинуть элементы массива на M элементов вправо.

Ограничение:
0 < N < 100
-1000 < ai < 1000
0 <= M < 100

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
5
38 44 0 -11 2
2

Пример выходных данных
-11 2 38 44 0
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();

        int[] arrNew = new int[N];
        for (int i = 0; i < arr.length; i++) {
            if (i + M >= arr.length) {
                arrNew[i + M - arr.length] = arr[i];
            } else {
                arrNew[i + M] = arr[i];
            }
        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
}
