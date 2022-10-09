package ru.dad.task1_3;

import java.util.Scanner;

/*
10. Елочка
Вывести на экран "ёлочку" из символа решетки (#) заданной высоты N.
На N + 1 строке у "ёлочки" должен быть отображен ствол из символа |

Ограничение:
2 < n < 10

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
3

Пример выходных данных
    #
   ###
  #####
    |
 */
public class Solution10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;

        do {
            N = scanner.nextInt();
        } while (!(N > 2 && N < 10));

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = N; i < N + 1; i++) {
            for (int j = 0; j < 2 * N + 1; j++) {
                if (j ==  (2 * N - 1) / 2) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}

