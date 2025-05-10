public class Main {
    public static void main(String[] args) {
        double midterm=35,finalexam=75,average=0;

        if ((midterm >= 0 && midterm <=100) && (finalexam >=0 && finalexam <=100))
        {
            average=(midterm*40/100)+(finalexam*60/100);
            
            System.out.println("Your average: "+average);

            if(finalexam >=50 && average>=50)
            {
                System.out.println("Your pass");
            }
            else
            {
                System.out.println("Your fail");
            }


        }



    }
}