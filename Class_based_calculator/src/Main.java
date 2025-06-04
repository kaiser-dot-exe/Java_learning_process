import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Basic_operations four_opertions = new Basic_operations();

        System.out.println("1 for Summation,\n2 for Subtract,\n3 for Multiplication ,\n4 for Division: ");
        int process = input.nextInt();

        System.out.println("Are the numbers you want to enter integers?: (E/H)");
        char type = input.next().toLowerCase().charAt(0);

        if (type == 'e') {
            System.out.println("Enter your first number :");
            int a = input.nextInt();

            System.out.println("Enter your second number :");
            int b = input.nextInt();

            if (process == 1) {
                four_opertions.Total(a, b);
            } else if (process == 2) {
                four_opertions.Subtraction(a, b);
            } else if (process == 3) {
                four_opertions.Multiplication(a, b);
            } else if (process == 4) {
                four_opertions.Division(a, b);
            } else {
                System.out.println("Invalid operation");
            }


        } else {
            System.out.println("Enter your first number :");
            double a = input.nextDouble();

            System.out.println("Enter your second number :");
            double b = input.nextDouble();

            if (process == 1) {
                four_opertions.Total(a, b);
            } else if (process == 2) {
                four_opertions.Subtraction(a, b);
            } else if (process == 3) {
                four_opertions.Multiplication(a, b);
            } else if (process == 4) {
                four_opertions.Division(a, b);
            } else {
                System.out.println("Invalid operation");
            }


        }


    }


}