public class Car extends Vihicle {

    private String color;

    public Car(int speed, String model, String color) {
        super(speed, model);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void move() {
        System.out.println("the car is moving");
    }
}
