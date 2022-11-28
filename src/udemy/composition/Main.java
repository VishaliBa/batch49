package udemy.composition;

public class Main {
    public static void main(String[] args) {
    Walls walls = new Walls("Purple");
    Celling celling = new Celling(15, "White");
    Bed bed = new Bed("Modern", 4, 3, 2, 1);
    Lamp lamp = new Lamp("Classic", true, 4);
    Bedroom bedroom = new Bedroom("Vishali", walls,celling,lamp, bed);
    bedroom.makeBed();

    bedroom.getLamp().turnOn();
    }
}
