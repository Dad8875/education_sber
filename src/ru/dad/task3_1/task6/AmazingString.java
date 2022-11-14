package ru.dad.task3_1.task6;

/**
 * 6. Необходимо реализовать класс AmazingString, который хранит внутри себя
 * строку как массив char и предоставляет следующий функционал:
 * Конструкторы:
 * ● Создание AmazingString, принимая на вход массив char
 * ● Создание AmazingString, принимая на вход String
 * Публичные методы (названия методов, входные и выходные параметры
 * продумать самостоятельно). Все методы ниже нужно реализовать “руками”, т.е.
 * не прибегая к переводу массива char в String и без использования стандартных
 * методов класса String.
 * ● Вернуть i-ый символ строки
 * ● Вернуть длину строки
 * ● Вывести строку на экран
 * ● Проверить, есть ли переданная подстрока в AmazingString (на вход
 * подается массив char). Вернуть true, если найдена и false иначе
 * ● Проверить, есть ли переданная подстрока в AmazingString (на вход
 * подается String). Вернуть true, если найдена и false иначе
 * ● Удалить из строки AmazingString ведущие пробельные символы, если
 * они есть
 * ● Развернуть строку (первый символ должен стать последним, а
 * последний первым и т.д.)
 */
public class AmazingString {
    private char[] chars;

    public AmazingString(char[] chars) {
        this.chars = chars;
    }

    public AmazingString(String str) {
        chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
    }

    public char getFirstSymbol() {
        return chars[0];
    }

    public int getLengthString() {
        return chars.length;
    }

    public void printString() {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public boolean substringInArrayChars(char[] chars) {
        int m = this.chars.length;
        int n = chars.length;

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n && i + j < m && chars[j] == this.chars[i + j]) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public boolean substringInString(String str) {

        int m = this.chars.length;
        int n = str.toCharArray().length;

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n && i + j < m && str.charAt(j) == this.chars[i + j]) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public void deleteFirstBackspaceSymbol() {
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] <= ' ') {
                for (int j = i + 1; j < this.chars.length; j++) {
                    this.chars[j - 1] = this.chars[j];
                }
            }
        }
    }

    public void reverseString() {
        for (int i = this.chars.length - 1; i >= 0; i--) {
            System.out.print(this.chars[i]);
        }
        System.out.println();
    }
}
