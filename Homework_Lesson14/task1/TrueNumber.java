package Homework_Lesson14.task1;

@FunctionalInterface
public interface TrueNumber {

    boolean correctNumber(int num);


}
/**
 Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
 Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число делится без остатка на 13.

 */