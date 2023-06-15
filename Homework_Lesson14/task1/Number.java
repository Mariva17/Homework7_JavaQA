package Homework_Lesson14.task1;

public class Number {

    public static void main(String[] args) {

        TrueNumber number = num -> num % 13 == 0;
        System.out.println(number.correctNumber(39));
        System.out.println(number.correctNumber(18));
        System.out.println(number.correctNumber(26));

    }


}
