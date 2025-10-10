package arrayexercise.bonus.aufgabe04;

public class Main {
    public static void main(String[] args) {
        int[] examGrades = {85, 70, 95, 60};
        int sum = 0;
        double average;

        for (int grade : examGrades) {
            sum += grade;
        }

        average = (double) sum / examGrades.length;

        if (average >= 70) {
            System.out.println("Bestanden");
        } else {
            System.out.println("Nicht bestanden");
        }
    }
}
