package Homework_Lesson14.task2;

public class TestStrings {

    public static void main(String[] args) {

        LongestString correctString = (String str1, String str2) -> {
            if (str1.length() > str2.length()) {
                return str1;
            } else {
                return str2;
            }
        };
        System.out.println(correctString.getString("Hello!", "Hi, Java!"));

    }

}
