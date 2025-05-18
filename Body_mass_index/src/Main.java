import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter your length.(Must be in metres.):");
        double length = input.nextDouble();

        System.out.print("Enter your weight:");
        double weight = input.nextDouble();


        double bsi = weight / (length * length);

        if (bsi < 18.5) {
            System.out.println("Moderate Thinness");
        } else if (bsi >= 18.5) {
            System.out.println("Normal");
        } else if (bsi >= 25) {
            System.out.println("Overweight");
        } else if (bsi >= 30) {
            System.out.println("Obese Class 1");
        } else if (bsi >= 35) {
            System.out.println("Obese Class 2");
        } else if (bsi >= 40) {
            System.out.println("Obese Class 3");
        }


    }
}