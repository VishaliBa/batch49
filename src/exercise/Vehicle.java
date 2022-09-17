package exercise;

public class Vehicle {
    private static String c;

    public static void setColor(String color) {
        c = color;
    }

    public static String getColor() {
        return c;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.c = "blue";
        System.out.println(v1.c);

//        v1.setColor("Red");
//        System.out.println(v1.getColor());
    }
}


