package javabasics.methodenexercises.medium;

public class Main {
    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);

        System.out.println(calculateArea(4.5, 2.4));

        checkPositive(5);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void checkPositive(int num) {
        if (num < 0) {
            System.out.println("Negative Zahl");
            return;
        }

        System.out.println("Positive Zahl");
    }
}
