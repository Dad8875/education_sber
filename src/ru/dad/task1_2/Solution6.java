package ru.dad.task1_2;

import java.util.Scanner;

/*
На следующий день на работе Петю и его коллег попросили заполнить
анкету. Один из вопросов был про уровень владения английского. Петя и его
коллеги примерно представляют, сколько они знают иностранных слов. Также у
них есть табличка перевода количества слов в уровень владения английском
языком. Было бы здорово автоматизировать этот перевод!
На вход подается положительное целое число count - количество выученных
иностранных слов. Нужно вывести какому уровню соответствует это количество.

 */
public class Solution6 {
    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();

        if (count < 500)
            System.out.println("beginner");
        else if (count < 1500)
            System.out.println("pre-intermediate");
        else if (count < 2500)
            System.out.println("inter-mediate");
        else if (count < 3500)
            System.out.println("upper-intermediate");
        else
            System.out.println("fluent");
    }
}
