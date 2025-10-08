package javabasics.datatypesexercises.medium;

public class Main {
    public static void main(String[] args) {
        String firstName = "Stanislav";
        int age = 42;
        double height = 1.95;

        System.out.println("Mein Name ist " + firstName + ", ich bin " + age + " Jahre alt und " + height + " Meter groß.");
        System.out.println();

        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Du bist erwachsen");
        } else {
            System.out.println("Du bist ein Kind");
        }
        System.out.println();

        int num1 = 42;
        int num2 = 9;

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
        System.out.println();

        String quote = "Where we're going, we don't need roads.";
        System.out.println(quote);
        System.out.println(quote.length());
        System.out.println(quote.charAt(0));
        System.out.println(quote.toUpperCase());
    }
}
