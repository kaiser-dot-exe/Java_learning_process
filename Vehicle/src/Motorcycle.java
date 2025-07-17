public class Motorcycle extends Vehicle {

    private int gears;

    public Motorcycle(String make, int gears) {
        super(make);
        this.gears = gears;
        System.out.println("Make" + gears + " gears motorycle was created.");


    }

    public void chanceGears(int newGears) {
        System.out.println(getMake() + " motorycle gears " + newGears + " changed it to..");
    }


    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Gears: " + gears);
        System.out.println("----------------------");
    }

}
