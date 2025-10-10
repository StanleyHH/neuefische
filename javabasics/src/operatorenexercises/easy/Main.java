package operatorenexercises.easy;

public class Main {
    public static void main(String[] args) {
        int num1 = 44;
        int num2 = 22;
        int sum = num1 + num2;
        System.out.println(sum);

        if (num1 == num2) {
            System.out.println("gleich");
        } else {
            System.out.println("ungleich");
        }

        System.out.println(num1 > 0 && num1 < 100);
    }
}
