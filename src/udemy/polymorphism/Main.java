package udemy.polymorphism;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
    return "Car -> startEngine()";
    }

    public String accelerate() {
    return "Car -> accelerate()";
    }

    public String brake(){
    return "Car -> brake()";
    }
    class Mitsubishi extends Car {
        public Mitsubishi(int cylinder, String name) {
            super(cylinder, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi -> accelerate()";
        }

        @Override
        public String brake() {
            return "Mitsubishi -> brake()";
        }
    }

}
    public class Main{
        public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car.Mitsubishi mitsubishi = (Car.Mitsubishi) new Car(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());


    }
}

