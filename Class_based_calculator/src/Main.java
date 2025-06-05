import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Basic_operations basic_operations = new Basic_operations();


        System.out.print("Enter your first number");

        if (scanner.hasNextInt()==true) {

            int a = scanner.nextInt();
            System.out.print("Enter your second number");
            int b = scanner.nextInt();

            System.out.println("1 for Summation,\n2 for Subtract,\n3 for Multiplication ,\n4 for Division: ");
            int process = scanner.nextInt();

            if (process == 1) {
                System.out.println(basic_operations.Total(a, b));
            } else if (process == 2) {
                System.out.println(basic_operations.Subtraction(a, b));
            } else if (process == 3) {
                System.out.println(basic_operations.Multiplication(a, b));
            } else if (process == 4) {
                System.out.println(basic_operations.Division(a, b));
            } else {
                System.out.println("Invalid operation");
            }


        } else if (scanner.hasNextInt()==false) {
            double a = scanner.nextDouble();
            System.out.print("Enter your second number");
            double b = scanner.nextDouble();

            System.out.println("1 for Summation,\n2 for Subtract,\n3 for Multiplication ,\n4 for Division: ");
            int process = scanner.nextInt();

            if (process == 1) {
                System.out.println(basic_operations.Total(a, b));
            } else if (process == 2) {
                System.out.println(basic_operations.Subtraction(a, b));
            } else if (process == 3) {
                System.out.println(basic_operations.Multiplication(a, b));
            } else if (process == 4) {
                System.out.println(basic_operations.Division(a, b));
            } else {
                System.out.println("Invalid operation");
            }

        }else  {
            System.out.println("Enter an integer or double value!");
        }

    }
}
