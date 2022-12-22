package ru.dad.pm_3.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
4. Написать метод, который с помощью рефлексии получит все интерфейсы
класса, включая интерфейсы от классов-родителей и интерфейсов-родителей.
*/
public class Main {
    public static void main(String[] args) {
        List<?> list = getAllInterfaces(Integer.class);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static List<?> getAllInterfaces(Class<?> cls) {
        List<Class<?>> list = new ArrayList<>();
        while (cls != Object.class) {
            list.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }

        for (Class<?> aClass : list) {
            if (aClass.getSuperclass() != null) {
                list.addAll(Collections.singletonList(aClass.getSuperclass()));
            }
        }
        return list;
    }
}
