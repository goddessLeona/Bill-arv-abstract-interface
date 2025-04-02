public abstract class ElectronicDevice {

    private String brand;

    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public abstract void turnOn();
}
