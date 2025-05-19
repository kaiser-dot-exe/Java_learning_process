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
                Total(a, b);
                break;
            case 2:
                Subtract(a, b);
                break;
            case 3:
                Division(a, b);
                break;
            case 4:
                Multiplication(a, b);
                break;


        }

    }

    public static double Total(int x, int y) {
        double totaly = (x + y);
        System.out.print(totaly);
        return totaly;
    }

    public static double Subtract(int x, int y) {
        double subtrack = (x - y);
        System.out.print(subtrack);
        return subtrack;
    }

    public static double Division(int x, int y) {
        double div = (x / y);
        System.out.print(div);
        return div;
    }

    public static double Multiplication(int x, int y) {
        double impact = (x * y);
        System.out.print(impact);
        return impact;
    }


}
