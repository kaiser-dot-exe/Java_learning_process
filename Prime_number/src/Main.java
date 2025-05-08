public class Main {
    public static void main(String[] args) {
    int num=28,div,check_prime=0;
    for(int i=2;i<=num/2;i++){
        if (num%i==0){
            check_prime=1;

        }else{
            break;
        }


    }if(check_prime==0) {
            System.out.println("Your number is not prime number");
        }else{
            System.out.println("Your number is prime number");
        }


    }

}