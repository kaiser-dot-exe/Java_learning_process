public class Car {
    //Attributes-Fields:
    //Things a car has.

    String make;
    String model;
    String colour;
    int speed;


    //Constructor:
    // This method allows us to set the make, model and color when creating a new car.
    public Car(String make, String model, String colour) {

        this.make = make;
        this.model = model;
        this.colour = colour;
        this.speed = speed;
    }
    //Methods:
    //Actions that a car can do.

    public void start(){
        System.out.println(make+" "+model+" is starting.");
    }
    public void stop(){
        System.out.println(make+" "+model+" is stoping.");
        speed=0;
    }
    public void accelerate(int amount ){
        speed+=amount;
        System.out.println(make+" "+model+" is speed "+speed+" km/s.");
    }
    public void info(){
        System.out.println("Car informations:");
        System.out.println("---");
        System.out.println("Make: "+make);
        System.out.println(("Model: "+model));
        System.out.println(("Colour: "+colour));
        System.out.println(("Speed: "+speed+" km/s"));
        System.out.println("---");
    }


}
