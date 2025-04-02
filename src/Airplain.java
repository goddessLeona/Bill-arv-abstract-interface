public class Airplain extends Vihicle implements Flyable {

    public Airplain(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void move() {
        System.out.println("Airplane are flying fast");
    }

    @Override
    public void fly() {
        System.out.println("Wooo hoo the plane is in the air flying");
    }
}
