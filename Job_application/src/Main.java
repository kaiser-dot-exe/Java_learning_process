import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter the your age: ");
        int age = input.nextInt();

        if (age < 35) {

            System.out.println("Do you have a driver's license?(Y/N): ");
            String license = input.next();

            System.out.println("Are you a university graduate? (Y/N): ");
            String graduate = input.next();

            if (license == "Y" || license == "y" && graduate == "Y" || graduate == "y") {
                System.out.println("Congratulations, you're hired.");


            }
            else {
                System.out.println("Unfortunately, you were not hired.");
            }
        }
        else {
            System.out.println("Unfortunately, you were not hired.");
        }


    }
}