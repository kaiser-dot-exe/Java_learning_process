import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("1 for summation,\n2 for subtract,\n3 for division,\n4 for multiplication: ");
        int process = input.nextInt();

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();


        switch (process) {
            case 1:
                System.out.println(Total(a, b));
                break;
            case 2:
                System.out.println(Subtract(a, b));
                break;
            case 3:
                System.out.println(Division(a, b));
                break;
            case 4:
                System.out.println(Multiplication(a, b));
                break;


        }
    }

    public static double Total(int x, int y) {
        double totaly = (x + y);
        return totaly;
    }

    public static double Subtract(int x, int y) {
        double subtrack = (x - y);
        return subtrack;
    }

    public static double Division(int x, int y) {
        double div = (x / y);
        return div;
    }

    public static double Multiplication(int x, int y) {
        double impact = (x * y);
        return impact;
    }


}
