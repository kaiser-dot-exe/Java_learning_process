import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter your midterm exam score:");
        double midterm = input.nextDouble();

        System.out.print("Enter your midterm exam score:");
        double finalexam = input.nextDouble();

        double average = 0;

        if ((midterm >= 0 && midterm <= 100) && (finalexam >= 0 && finalexam <= 100)) {
            average = (midterm * 40 / 100) + (finalexam * 60 / 100);

            System.out.println("Your average: " + average);

            if (finalexam >= 50 && average >= 50) {
                System.out.println("Your pass");
            } else {
                System.out.println("Your fail");
            }


        }


    }
}