package udemy.composition;

public class Bedroom {
    private String name;
    private Walls walls;
    private Celling celling;
    private Lamp lamp;
    private Bed bed;

    public Bedroom(String name, Walls walls, Celling celling, Lamp lamp, Bed bed) {
        this.name = name;
        this.walls = walls;
        this.celling = celling;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed ");
        bed.make();
    }
}

