package operatorenexercises.bonus.aufgabe01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib ein Zahl ein: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num > 10 && num < 20 && num % 2 == 1) {
            System.out.println("Treffer!");
        } else {
            System.out.println("Kein Treffer!");
        }
    }
}
