package ru.dad.task2_1;

import java.util.Scanner;

/*
9. Найти дубликат
На вход подается число N — длина массива.
Затем передается массив строк из N элементов (разделение через перевод строки).
Каждая строка содержит только строчные символы латинского алфавита.

Необходимо найти и вывести дубликат на экран.
Гарантируется что он есть и только один.

Ограничение:
0 < N < 100
0 < ai.length() < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
4
hello
java
hi
java


Пример выходных данных
java
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String[] ai = new String[N];

        for (int i = 0; i < N; i++) {
            ai[i] = scanner.next();
        }
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(ai[i].equals(ai[j])) {
                    count++;
                    if(count != 1) {
                        return;
                    } else {
                        System.out.println(ai[i]);
                    }
                }
            }
        }
    }
}
