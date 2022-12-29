package ru.dad.pm_4.task6;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/*
6. Дан Set<Set<Integer>>. Необходимо перевести его в Set<Integer>.
*/
public class Task6 {
    public static void main(String[] args) {
        Set<Set<Integer>> sets = Set.of(
                Set.of(0, 1, 2),
                Set.of(3, 4, 5),
                Set.of(6, 7, 8),
                Set.of(2, 14, 23));
        Set<Integer> collect = sets.stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }
}
