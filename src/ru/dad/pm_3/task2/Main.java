package ru.dad.pm_3.task2;

import ru.dad.pm_3.task1.IsLike;

/*
2. Написать метод, который рефлексивно проверит наличие аннотации @IsLike на
любом переданном классе и выведет значение, хранящееся в аннотации, на
экран.
*/
public class Main {
    public static void main(String[] args) {
       isAnnotationIsLike(Test.class);
    }

    public static boolean isAnnotationIsLike(Class<?> cls) {
        if (!cls.isAnnotationPresent(IsLike.class)) {
            return false;
        }
        IsLike like = cls.getAnnotation(IsLike.class);
        System.out.println(like.annotationField());
        return true;
    }
}
@IsLike(annotationField = true)
class Test {}
