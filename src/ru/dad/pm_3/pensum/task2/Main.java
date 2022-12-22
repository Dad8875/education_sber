package ru.dad.pm_3.pensum.task2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
2. Дана строка, состоящая из символов “(“, “)”, “{”, “}”, “[“, “]”
Необходимо написать метод, принимающий эту строку и выводящий результат,
является ли она правильной скобочной последовательностью или нет.
Условия для правильной скобочной последовательности те, же что и в задаче 1,
но дополнительно:
● Открывающие скобки должны быть закрыты однотипными
закрывающими скобками.
● Каждой закрывающей скобке соответствует открывающая скобка того же
типа.
Пример:
Входные данные Выходные данные
{()[]()}            true
{)(}                false
[}                  false
[{(){}}][()]{}      true

 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isBracketsSequence("[{(){}}][()]{}"));
        System.out.println(isBracketsSequence("[}"));
        System.out.println(isBracketsSequence("{)(}"));
        System.out.println(isBracketsSequence("{()[]()}"));
    }

    public static boolean isBracketsSequence(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
