package UdemySection6.inheritance;

public class Audi extends Car{
    private int roadServiceMonths;

    public Audi(int roadService) {
        super("Audi", "4WD", 5, 3 ,4,false);
        this.roadServiceMonths = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            setCurrentDirection(1);
        } else if (newVelocity >10 && newVelocity <= 20) {
            setCurrentGear(2);
        } else if (newVelocity >20 && newVelocity <= 30) {
            setCurrentGear(3);
        }else {
            setCurrentGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentVelocity());
        }
    }
}
