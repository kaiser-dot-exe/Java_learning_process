public class Car extends Vehicle {

    private int doors;

    public Car(String make, int doors) {
        super(make);
        this.doors = doors;
        System.out.println("Make" + doors + " door car was created.");

    }



    public void doorsLock(){
        System.out.println(getMake() + " The car doors were locked.");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Doors: " + doors);
        System.out.println("----------------------");
    }

}
