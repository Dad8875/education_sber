package ru.dad.task1_2.pensum;

import java.util.Scanner;

/*
Старый телефон Андрея сломался, поэтому он решил приобрести
новый. Продавец телефонов предлагает разные варианты, но Андрея
интересуют только модели серии samsung или iphone. Также Андрей решил
рассматривать телефоны только от 50000 до 120000 рублей. Чтобы не тратить
время на разговоры, Андрей хочет написать программу, которая поможет ему
сделать выбор.
На вход подается строка – модель телефона и число – стоимость телефона.
Нужно вывести "Можно купить", если модель содержит слово samsung или
iphone и стоимость от 50000 до 120000 рублей включительно. Иначе вывести
"Не подходит".
Гарантируется, что в модели телефона не указано одновременно несколько
серий.

 */
public class Solution3 {
    public static void main(String[] args) {
        String modelPhone;
        int pricePhone;

        Scanner scanner = new Scanner(System.in);
        modelPhone = scanner.nextLine();
        pricePhone = scanner.nextInt();

        if ((pricePhone >= 50000 && pricePhone <= 120000) && ((modelPhone.contains("samsung") || modelPhone.contains("iphone"))))
            System.out.println("Можно купить");
        else
            System.out.println("Не подходит");
    }
}
