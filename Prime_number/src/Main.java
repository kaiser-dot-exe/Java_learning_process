public class Main {
    public static void main(String[] args) {
        int num = 23;

        if (num == 2 || num == 3)
        {
            System.out.println("Your number is prime number");
            return;

        }
        
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0)
            {
                System.out.println("Your number is not prime number");
                return;

            }



        }

        System.out.println("Your number is prime number");




    }
}