public class Main {
    public static void main(String[] args) {

      double length=1.75,kilo=90,bsi;
      // length must be in metres.

      bsi=kilo/(length*length);

      if (bsi<18.5)
      {
          System.out.println("Moderate Thinness");
      }

      else if(bsi>=18.5)
      {
          System.out.println("Normal");
      }

      else if(bsi>=25)
      {
          System.out.println("Overweight");
      }

      else if(bsi>=30)
      {
          System.out.println("Obese Class 1");
      }

      else if(bsi>=35)
      {
          System.out.println("Obese Class 2");
      }

      else if(bsi>=40)
      {
          System.out.println("Obese Class 3");
      }



    }
}