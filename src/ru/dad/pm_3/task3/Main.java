package ru.dad.pm_3.task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> aClass = APrinter.class;
        try {
            Method method = aClass.getDeclaredMethod("print", int.class);
            APrinter printer = new APrinter();
            method.invoke(printer, 33);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


