public class Main {
    public static void main(String[] args) {
        int number = 7, sum = 0;
        for (int i = 1; (i <= (number / 2)); i++) {


            if (number % i == 0) {
                sum += i;


            }

        }

        if (number == sum) {
            System.out.println("Your number is perfect.");
        }
        else {
            System.out.println("Your number is not perfect.");
        }


    }
}