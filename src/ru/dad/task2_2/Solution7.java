package ru.dad.task2_2;

import java.util.Scanner;

/*
7. Конкурс красоты
Раз в год Петя проводит конкурс красоты для собак.
К сожалению, система хранения участников и оценок неудобная, а победителя определить надо.
В первой таблице в системе хранятся имена хозяев, во второй - клички животных, в третьей —
оценки трех судей за выступление каждой собаки.Таблицы связаны между собой только по индексу.
То есть хозяин i-ой собаки указан в i-ой строке первой таблицы, а ее оценки — в i-ой строке
третьей таблицы.
Нужно помочь Пете определить топ 3 победителей конкурса.

На вход подается число N — количество участников конкурса. Затем в N строках переданы имена хозяев.
После этого в N строках переданы клички собак.
Затем передается матрица с N строк, 3 вещественных числа в каждой — оценки судей.
Победителями являются три участника, набравшие максимальное среднее арифметическое по оценкам 3 судей.
Необходимо вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
Среднюю оценку выводить с точностью один знак после запятой.

Гарантируется, что среднее арифметическое для всех участников будет различным.

Ограничение:
0 < N < 100

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
4
Иван
Николай
Анна
Дарья
Жучка
Кнопка
Цезарь
Добряш
7 6 7
8 8 7
4 5 6
9 9 9

Пример выходных данных
Дарья: Добряш, 9.0
Николай: Кнопка, 7.6
Иван: Жучка, 6.6
 */
public class Solution7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = Integer.parseInt(s);

        String[] nameOwner = new String[n];
        for (int i = 0; i < n; i++) {
            nameOwner[i] = scanner.nextLine();
        }
        String[] namePet = new String[n];

        for (int i = 0; i < n; i++) {
            namePet[i] = scanner.nextLine();
        }

        String[] nameTotal = new String[n];
        for (int i = 0; i < n; i++) {
            nameTotal[i] = nameOwner[i] + ": " + namePet[i] + ", ";
        }

        double[][] rating = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                rating[i][j] = scanner.nextDouble();
            }
        }

        double[] averageRating = new double[n];
        for (int i = 0; i < n; i++) {
            averageRating[i] = (int) ((rating[i][0] + rating[i][1] + rating[i][2]) / 3 * 10) / 10.0;
        }

        double temp = averageRating[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (temp < averageRating[i]) {
                temp = averageRating[i];
                index = i;
            }
        }

        double temp1 = averageRating[0];
        int index1 = 0;
        for (int i = 1; i < n; i++) {
            if (temp1 < averageRating[i] && i != index) {
                temp1 = averageRating[i];
                index1 = i;
            }
        }

        double temp2 = averageRating[0];
        int index2 = 0;
        for (int i = 1; i < n; i++) {
            if (temp2 < averageRating[i] && i != index && i != index1) {
                temp2 = averageRating[i];
                index2 = i;
            }
        }

        System.out.println(nameTotal[index] + averageRating[index]);
        System.out.println(nameTotal[index1] + averageRating[index1]);
        System.out.println(nameTotal[index2] + averageRating[index2]);
    }
}
