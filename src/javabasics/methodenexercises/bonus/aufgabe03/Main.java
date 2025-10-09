package javabasics.methodenexercises.bonus.aufgabe03;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 34;

        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(3.5, 3));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division durch 0!");
        }

        return num1 / num2;
    }
}
