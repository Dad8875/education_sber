package ru.dad.pm_2.task3;

import java.util.HashSet;
import java.util.Set;

/*
3. Реализовать класс PowerfulSet, в котором должны быть следующие методы:
a. public <T> Set<T> intersection(Set<T> set1, Set<T> set2) — возвращает
пересечение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}.
Вернуть {1, 2}

b. public <T> Set<T> union(Set<T> set1, Set<T> set2) — возвращает
объединение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}.
Вернуть {0, 1, 2, 3, 4}

c. public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) —
возвращает элементы первого набора без тех, которые находятся также
и во втором наборе. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {3}
*/
public class PowerfulSet {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(34);
        s1.add(23);
        s1.add(12);
        s1.add(5);

        Set<Integer> s2 = new HashSet<>();
        s2.add(5);
        s2.add(12);
        s2.add(89);
        s2.add(48);
        s2.add(51);
        s2.add(7);

        PowerfulSet set = new PowerfulSet();
        System.out.println(set.intersection(s1, s2));
        System.out.println(set.union(s1, s2));
        System.out.println(set.relativeComplement(s1, s2));
    }
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
