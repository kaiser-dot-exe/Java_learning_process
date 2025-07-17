public class Vehicle {
    private String make;
    private int speed;

    public Vehicle(String make) {
        this.make = make;
        this.speed = 0;
        System.out.println("A new " + make + " brand vehicle created.");

    }

    public void start() {
        System.out.println(make + " is start.");
    }

    public void stop() {
        System.out.println(make + " is stop.");
        this.speed = 0;
    }

    public void accelerate(int amount) {
        this.speed += amount;
        System.out.println(make + "  " + amount + " is accelerate. New speed: " + this.speed + " km/s.");
    }


    public String getMake() {
        return make;

    }

    public int getSpeed() {
        return speed;

    }
    public void getInfo(){
        System.out.println("--- Vehicle İnformations ---");
        System.out.println("Make: "+getMake());
        System.out.println("İnstand speed: "+getSpeed()+" km/s");
    }


}
