package Homework_Lesson14.task3;

public class TestDiscriminant {
    public static void main(String[] args) {

        Discriminant discr = (double a, double b, double c) -> Math.pow(b, 2) - 4*a*c;

        System.out.println(discr.calculateDiscriminant(2.8, 12.55, 8.2));
    }




}
