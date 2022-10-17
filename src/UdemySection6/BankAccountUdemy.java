package UdemySection6;

public class BankAccountUdemy {
    private String bankAccount;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccountUdemy(){
        System.out.println("Empty constructor called");
    }

       public String getBankAccount() {
           String BankAccount;
           return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance < withdrawalAmount) {
            System.out.println("Only " + this.balance + " available. You cannot make withdrawal");
        } else {
            this.balance -=  withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +" Processed. Remaining balance " + this.balance);
        }
    }
}
