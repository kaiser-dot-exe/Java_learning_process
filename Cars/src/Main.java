public class Main {
    public static void main(String[] args) {
        Car mycar1 = new Car("Ferrari", "F40", "Red");
        Car mycar2 = new Car("Porsche", "911 GT3 RS", "Green");

        mycar1.info();
        mycar1.start();
        mycar1.accelerate(60);
        mycar1.accelerate(110);
        mycar1.info();

        System.out.println("\n");

        mycar2.info();
        mycar2.start();
        mycar2.accelerate(55);
        mycar2.accelerate(120);
        mycar2.info();












    }
}