public class Main {
    public static void main(String[] args) {

        System.out.println("--- Car has been created ---");
        Car bmw = new Car("BMW", 4);

        System.out.println("\n--- Motorycle has been crated ---");
        Motorcycle honda = new Motorcycle("Honda", 6);

        System.out.println("\n--- Otomobil transactions ---");
        bmw.start();
        bmw.accelerate(60);
        bmw.doorsLock();
        bmw.getInfo();





        System.out.println("\n--- Motosiklet İşlemleri ---");
        honda.start();
        honda.accelerate(80);
        honda.chanceGears(3);
        honda.stop();
        honda.getInfo();


        bmw.accelerate(100);
        System.out.println("\nBMW'nin anlık hızı (getter ile): " + bmw.getSpeed() + " km/s");








    }
}