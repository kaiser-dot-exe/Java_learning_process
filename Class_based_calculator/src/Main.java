import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Basic_operations four_opertions = new Basic_operations();

        System.out.print("Enter your first number: ");
        String num1 = input.next();
        System.out.print("Enter your second number: ");
        String num2 = input.next();

        System.out.println("1 for Summation,\n2 for Subtract,\n3 for Multiplication ,\n4 for Division: ");
        int process = input.nextInt();

        try {

            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);

            if (process == 1) {
                System.out.println(four_opertions.Total(a, b));
            } else if (process == 2) {
                System.out.println(four_opertions.Subtraction(a, b));
            } else if (process == 3) {
                System.out.println(four_opertions.Multiplication(a, b));
            } else if (process == 4) {
                System.out.println(four_opertions.Division(a, b));
            } else {
                System.out.println("Invalid operation");
            }

        } catch (NumberFormatException e) {
            try {

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);

                if (process == 1) {
                    System.out.println(four_opertions.Total(a, b));
                } else if (process == 2) {
                    System.out.println(four_opertions.Subtraction(a, b));
                } else if (process == 3) {
                    System.out.println(four_opertions.Multiplication(a, b));
                } else if (process == 4) {
                    System.out.println(four_opertions.Division(a, b));
                } else {
                    System.out.println("Invalid operation");
                }

            } catch (NumberFormatException ex) {

            }


        }


    }
}