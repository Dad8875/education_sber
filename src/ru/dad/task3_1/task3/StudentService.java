package ru.dad.task3_1.task3;

import ru.dad.task3_1.task2.Student;

import java.util.Arrays;

/**
 * 3. Необходимо реализовать класс StudentService.
 * У класса должны быть реализованы следующие публичные методы:
 * ● bestStudent() — принимает массив студентов (класс Student из
 * предыдущего задания), возвращает лучшего студента (т.е. который
 * имеет самый высокий средний балл). Если таких несколько — вывести
 * любого.
 * ● sortBySurname() — принимает массив студентов (класс Student из
 * предыдущего задания) и сортирует его по фамилии.
 */
public class StudentService {

    public static Student bestStudent(Student[] students) {
        Student result = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].averageScore() > result.averageScore()) {
                result = students[i];
            }
        }
        return result;
    }

    public static void sortBySurname(Student[] students) {
        Arrays.sort(students, (o1, o2) -> o1.getSurName().compareTo(o2.getSurName()));
    }
}
