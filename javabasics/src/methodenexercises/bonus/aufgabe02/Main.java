package methodenexercises.bonus.aufgabe02;

public class Main {
    public static void main(String[] args) {
        printSumMessage(4, 55);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void printSumMessage(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
    }
}
