public abstract class Vihicle {

    private int speed;
    private String model;

    public Vihicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vihicle{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    public abstract void move();
}
