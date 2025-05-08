public class Main {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 2; i <= num / 2; i++) {

            if (num == 2)
            {
                System.out.println("Your number is prime number");
                break;
            }
            else if(num % 2 ==0)
            {
                System.out.println("Your number is not prime number");
                break;

            }
            else if (num % i == 0)
            {
                System.out.println("Your number is not prime number");
                break;

            }
            else
            {
                System.out.println("Your number is prime number");
                break;
            }


        }

    }
}