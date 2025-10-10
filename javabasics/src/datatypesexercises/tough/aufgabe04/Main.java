package datatypesexercises.tough.aufgabe04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Gib die zweite Zahl ein: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Gib eine Kommazahl ein: ");
        double dNum = Double.parseDouble(scanner.nextLine());

        double result = (num1 - num2) / dNum;

        System.out.println("(" + num1 + " - " + num2 + ") / " + dNum + " = " + result);

        if (result > 0) {
            System.out.println("Der Ergebnis ist positiv.");
        } else {
            System.out.println("Der Ergebnis ist nicht positiv.");
        }
    }
}
