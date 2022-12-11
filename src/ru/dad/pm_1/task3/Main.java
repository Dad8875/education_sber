package ru.dad.pm_1.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
3. Реализовать метод, открывающий файл ./input.txt и сохраняющий в файл
./output.txt текст из input, где каждый латинский строчный символ заменен на
соответствующий заглавный. Обязательно использование try с ресурсами.
*/
public class Main {
    public static void main(String[] args) {
        openAndSaveFile();
    }

    public static void openAndSaveFile() {

        try (Scanner scanner = new Scanner(new File("src\\ru\\dad\\pm_1\\task3\\input.txt"));
             Writer writer = new FileWriter("src\\ru\\dad\\pm_1\\task3\\output.txt");) {
            while (scanner.hasNextLine()) {
                writer.write(scanner.nextLine().toUpperCase() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
