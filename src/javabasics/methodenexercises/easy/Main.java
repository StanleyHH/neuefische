package javabasics.methodenexercises.easy;

public class Main {
    public static void main(String[] args) {
        printHello();
        System.out.println(getGreeting());
        printName("Stanislav");
    }

    public static void printHello() {
        System.out.println("Hallo Welt");
    }

    public static String getGreeting() {
        return "Willkommen im Java-Kurs";
    }

    public static void printName(String name) {
        System.out.println("Hallo " + name);
    }
}
