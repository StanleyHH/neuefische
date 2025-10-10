package ifelseexercise.bonus.aufgabe02;

public class Main {
    public static void main(String[] args) {
        double x = 0.1 + 0.2;
        double eps = 1e-9;

        if (Math.abs(x - 0.3) < eps) {
            System.out.println("Fast 0.3");
        } else {
            System.out.println("Nicht gleich 0.3");
        }
    }
}
