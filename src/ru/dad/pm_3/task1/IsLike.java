package ru.dad.pm_3.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
1. Создать аннотацию @IsLike, применимую к классу во время выполнения
программы. Аннотация может хранить boolean значение
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IsLike {
    boolean annotationField();
}
