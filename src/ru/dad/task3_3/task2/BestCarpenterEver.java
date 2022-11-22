package ru.dad.task3_3.task2;
/*
2. Цех по ремонту BestCarpenterEver умеет чинить некоторую Мебель. К
сожалению, из Мебели он умеет чинить только Табуретки, а Столы, например,
нет. Реализовать метод в цеху, позволяющий по переданной мебели
определять, сможет ли ей починить или нет. Возвращать результат типа
boolean. Протестировать метод.
*/
public class BestCarpenterEver {
    public static void main(String[] args) {
        System.out.println(action(new Stool()));
        System.out.println(action(new Table()));
    }

    public static boolean action(Furniture furniture) {
        if (furniture instanceof Stool)
            return true;
        else
            return false;
    }
}
