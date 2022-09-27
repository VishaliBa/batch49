package UdemySection6;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

     Car(String model) {
        this.model = model;
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();

        if (validModel.equals("a4") || validModel.equals("f40")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
