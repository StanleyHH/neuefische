package arrayexercise.medium.aufgabe03;

public class Main {
    public static void main(String[] args) {
        String[] cities = {"Hamburg", "Berlin", "München", "Köln"};

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%2d: %-15s%n", i, cities[i]);
        }
    }
}
