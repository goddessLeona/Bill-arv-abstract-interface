public class Smartphone extends ElectronicDevice implements Rechargebale{

    public Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("The phone is turned on");
    }

    @Override
    public void charge() {
        System.out.println("The phone is charging");
    }
}
