package UdemySection6;

public class VipCustomer {
    String name;
    long creditLimit;
    String emailAddress;

    public VipCustomer(){
        this("Default name",5000, "default@gmail.com");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name,creditLimit,"unknown@gmail.com");
    }
    public VipCustomer(String name, long creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}