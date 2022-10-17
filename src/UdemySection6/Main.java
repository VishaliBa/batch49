package UdemySection6;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("A4");

        //audi.setModel("A4");
        System.out.println("Model is " + audi.getModel());

        //        BANK ACCOUNT UDEMY

        BankAccountUdemy bobsAccount = new BankAccountUdemy();
        bobsAccount.setBankAccount("1234");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bobs Brown");
        bobsAccount.setEmail("bob.brown@123.com");
        bobsAccount.setPhoneNumber("343 266-6999");

        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.00);

                  // VIP Customer //

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 5000);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Wish", 100000, "wish@gmail.com");
        System.out.println(customer3.getName());



    }



}
