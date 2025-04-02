public class Laptop extends ElectronicDevice implements Rechargebale {

    public Laptop(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("The laptop is turned on");
    }

    @Override
    public void charge() {
        System.out.println("The Laptop is charging");
    }
}
