public class Orc extends Enemy{


    public Orc(int health) {
        super(health);
    }


    @Override
    public void attac() {
        System.out.println("Orc attack's");
    }
}
