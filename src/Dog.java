public class Dog extends Animal{

    public Dog(String eat, String origen) {
        super(eat, origen);
    }

    @Override
    public void makeSounds() {
        System.out.println("woff woff");
    }

}
