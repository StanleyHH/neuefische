package operatorenexercises.medium;

public class Main {
    public static void main(String[] args) {
        int num1 = 345;
        int num2 = 23;
        int result = num1 % num2;
        System.out.println(result == 0 && num1 > 0);

        double preis = 4.45;
        boolean rabatt = true;

        if (rabatt) {
            System.out.println(preis * 0.9);
        } else {
            System.out.println(preis);
        }

        System.out.println(num1 % 2 == 0 || num1 > 50);
    }
}
