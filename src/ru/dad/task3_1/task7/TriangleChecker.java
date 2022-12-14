package ru.dad.task3_1.task7;

/**
 * 7. Реализовать класс TriangleChecker, статический метод которого принимает три
 * длины сторон треугольника и возвращает true, если возможно составить из них
 * треугольник, иначе false. Входные длины сторон треугольника — числа типа
 * double. Придумать и написать в методе main несколько тестов для проверки
 * работоспособности класса (минимум один тест на результат true и один на
 * результат false)
 */
public class TriangleChecker {
    public static boolean check(double a, double b, double c) {
        double max = 0;
        if (a > b && a > c) {
            max = a;
            if (b + c > max) {
                return true;
            } else {
                return false;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a + c > max) {
                return true;
            } else {
                return false;
            }
        } else {
            max = c;
            if (a + b > max) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(TriangleChecker.check(30, 10.4, 12.7));
        System.out.println(TriangleChecker.check(22, 10.4, 12.7));
        System.out.println(TriangleChecker.check(7.4, 3.7, 5.2));
    }
}
