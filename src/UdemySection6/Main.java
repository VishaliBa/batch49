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



                            // WALL  //

//        Wall wall = new Wall(5,4);
//
//        System.out.println("height= " + wall.getArea());

         Wall wall = new Wall(5,4);
         System.out.println("area= " + wall.getArea());

         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());

                // POINT //

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());



    }



}
