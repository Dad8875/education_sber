package ru.dad.task3_1.task5;
/**
 * 5. Необходимо реализовать класс DayOfWeek для хранения порядкового номера
 * дня недели (byte) и названия дня недели (String).
 * Затем в отдельном классе в методе main создать массив объектов DayOfWeek
 * длины 7. Заполнить его соответствующими значениями (от 1 Monday до 7
 * Sunday) и вывести значения массива объектов DayOfWeek на экран.
 * Пример вывода:
 * 1 Monday
 * 2 Tuesday
 * …
 * 7 Sunday
 */
public class DayOfWeek {
    private byte day;
    private String nameOfDay;

    public DayOfWeek(byte day) {
        this.day = day;
        switch (day) {
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            case 7:
                nameOfDay = "Sunday";
                break;
            default:
                System.out.println("неверные данные!");
        }
    }

    @Override
    public String toString() {
        return day + " " + nameOfDay;
    }
}
