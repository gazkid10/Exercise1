import java.util.Scanner;

public class GradingExercise {
    public static void main(String[] args) {
        Scanner scannerGrade = new Scanner(System.in);

        double A = 90;
        double B = 80;
        double C = 70;
        double D = 60;
        double F = 59;

        System.out.print("Enter grade: ");

        double Grade = scannerGrade.nextDouble();

        if (Grade >= 90.0) {
            System.out.print("You passed with an A!");
        } else if (Grade >= 80.0) {
            System.out.print("You passed with a B!");
        } else if (Grade >= 70.0) {
            System.out.print("You passed with a C!");

        } else if (Grade >= 60.0) {
            System.out.print("Your grade is a D!");

        } else {
            System.out.println("Your grade is an F!");
        }
        scannerGrade.close();

    }
}