public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("TR123456789", "Ali Can", 1000.0);
        BankAccount acc2 = new BankAccount("TR987654321", "Ayşe Demir", 500.0);


        System.out.println("--- Hesap Bilgileri ---");
        acc1.getBalance();
        acc2.getBalance();
        System.out.println("------------------------\n");

        acc1.deposit(200.0);
        acc1.getBalance();

        acc2.withdrawal(150.0);
        acc2.getBalance();

        acc1.withdrawal(1500.0);
        acc1.getBalance();

        acc2.deposit(-100.0);
        acc2.getBalance();

        System.out.println("\n--- Account Number Access ---");

        System.out.println("Ali'nin Hesap Numarası: " + acc1.getAccountNumber());
        System.out.println("Ayşe'nin Hesap Sahibi: " + acc2.getAccountNumber());
















    }
}