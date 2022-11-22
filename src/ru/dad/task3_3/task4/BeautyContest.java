package ru.dad.task3_3.task4;
/*
4. Переписать задачу 7 домашнего задания 2 часть 2 в стиле ООП.
● Нужно как минимум завести классы Dog и Participant.
● Нужно реализовать метод, определяющий трех победителей согласно
условию.
● Можно добавлять любые дополнительные методы и классы.
Условие задачи:
Раз в год Петя проводит конкурс красоты для собак. К сожалению, система
хранения участников и оценок неудобная, а победителя определить надо. В
первой таблице в системе хранятся имена хозяев, во второй - клички животных,
в третьей — оценки трех судей за выступление каждой собаки. Таблицы
связаны между собой только по индексу. То есть хозяин i-ой собаки указан в i-ой
строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы. Нужно
помочь Пете определить топ 3 победителей конкурса.

На вход подается число N — количество участников конкурса.
Затем в N строках переданы имена хозяев.
После этого в N строках переданы клички собак.
Затем передается матрица с N строк, 3 вещественных числа в каждой —оценки судей.
Победителями являются три участника, набравшие максимальное среднее арифметическое по оценкам 3 судей.
Необходимо вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
Гарантируется, что среднее арифметическое для всех участников будет
различным.
Ограничения:  0 < N < 100

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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautyContest {
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

        double[][] rating = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                rating[i][j] = scanner.nextDouble();
            }
        }

        List<Dog> dogList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dogList.add(new Dog(nameOwner[i], namePet[i]));
        }
        List<Participant> participants = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            participants.add(new Participant(dogList.get(i), rating[i]));
        }

        printOfWinners(participants);
    }

    public static void printOfWinners(List<Participant> participants) {
        participants.stream().sorted((o1, o2) -> (int) (o2.resultRating - o1.resultRating))
                .limit(3)
                .forEach(System.out::println);
    }
}
