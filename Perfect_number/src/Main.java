import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; (i <= (number / 2)); i++) {


            if (number % i == 0) {
                sum += i;


            }

        }

        if (number == sum) {
            System.out.println("Your number is perfect.");
        } else {
            System.out.println("Your number is not perfect.");
        }


    }
}