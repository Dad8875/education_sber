package ru.dad.pm_1.task6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
6. Фронт со своей стороны не сделал обработку входных данных анкеты! Петя
очень зол и ему придется написать свои проверки, а также кидать исключения,
если проверка провалилась. Помогите Пете написать класс FormValidator со
статическими методами проверки. На вход всем методам подается String str.

a. public void checkName(String str) — длина имени должна быть от 2 до 20
символов, первая буква заглавная.

b. public void checkBirthdate(String str) — дата рождения должна быть не
раньше 01.01.1900 и не позже текущей даты.

c. public void checkGender(String str) — пол должен корректно матчится в
enum Gender, хранящий Male и Female значения.

d. public void checkHeight(String str) — рост должен быть положительным
числом и корректно конвертироваться в double.
*/
public class FormValidator {
    public static void main(String[] args) {
        try {
            FormValidator.checkName("Александр");
            FormValidator.checkBirthDate("1995.07.16");
            FormValidator.checkHeight("1.84");
            FormValidator.checkGender("male");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkName(String str) throws Exception {
        if ((str.length() > 2 && str.length() < 20) && Character.isUpperCase(str.charAt(0))) {
            System.out.println("Name checked");
        } else {
            throw new Exception("Некорректное имя!");
        }
    }

    public static void checkBirthDate(String str) throws Exception {
        LocalDate date1 = LocalDate.of(1900, 1, 1);
        LocalDate date2 = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        LocalDate date3 = LocalDate.now();
        if (date2.compareTo(date1) > 0 || date2.compareTo(date3) < 0) {
            System.out.println("Birth date checked");
        } else {
            throw new Exception("Некорректная дата рождения");
        }
    }

    public static void checkGender(String str) throws Exception {
        if (str.equalsIgnoreCase(String.valueOf(Gender.FEMALE))) {
            System.out.println("Женщина");
        } else if (str.equalsIgnoreCase(String.valueOf(Gender.MALE))) {
            System.out.println("Мужчина");
        } else {
            throw new Exception("Неизвестное науке существо!");
        }
    }

    public static void checkHeight(String str) throws Exception {
        if (Double.parseDouble(str) > 0) {
            System.out.println("Height checked");
        } else {
            throw new Exception("Некорректный рост!");
        }
    }
}

enum Gender {
    MALE, FEMALE;
}
