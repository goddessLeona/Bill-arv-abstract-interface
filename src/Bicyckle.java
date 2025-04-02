public class Bicyckle extends Vihicle{

    public Bicyckle(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void move() {
        System.out.println("The bike is rolling");
    }
}
