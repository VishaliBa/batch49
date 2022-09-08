package exercise.oops;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    private double balance;

    public void withdraw(double amount){
        if(balance > amount){
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public  void deposit(double amount){
        balance = amount + balance;
        System.out.println("Amount deposit successfully");
    }

}
