import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a value: ");
        double a = input.nextDouble();
        System.out.print("Enter b value: ");
        double b = input.nextDouble();
        System.out.print("Enter c value: ");
        double c = input.nextDouble();

        double delta, x1, x2;

        delta = (b * b) - (4 * c * c);

        if (delta < 0) {
            System.out.println("no solution");
        } else if (delta > 0) {
            x1 = (-b + (Math.pow(delta, 0.5)) / (2 * a));
            x2 = (-b + (Math.pow(delta, 0.5)) / (2 * a));
            System.out.println("x1 = " + x1 + "\n" + "x2=" + x2);

        } else {
            x1 = -b / (2 * a);
            System.out.println("x1=x2=" + x1);

        }
    }
}