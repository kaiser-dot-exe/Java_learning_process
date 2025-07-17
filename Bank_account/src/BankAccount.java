public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;


    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        if (balance > 0) {
            this.balance = balance;

        } else {
            System.out.println("Error: Initial balance cannot be negative. Balance is set to 0.");
            this.balance = 0;
        }


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;

    }
    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println(amount + " TL has been deposited into your account. New balance:" + this.balance + " TL");

        }
        else{
            System.out.println("The amount to be discarded must be positive.");
        }

    }


    public void withdrawal(double amount){
        if(amount>0 && this.balance>=amount){
            this.balance-=amount;
            System.out.println(amount + " TL has been withdrawn from your account. New balance:" + this.balance + " TL");

        }
        else if (amount<0){
            System.out.println("The amount to be discarded must be positive.");
        }
        else {
            System.out.println("Insufficient funds! Available balance:" + this.balance + " TL");


        }

    }

    public void showBalance(){
        System.out.println("Account number: " + accountNumber + ", Owner: " + owner + ", Balance: " + balance + " TL");
    }


}