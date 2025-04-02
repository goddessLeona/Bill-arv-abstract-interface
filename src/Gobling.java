public class Gobling extends Enemy{

    public Gobling(int health) {
        super(health);
    }

    @Override
    public void attac() {
        System.out.println("Gobeling attac's");
    }
}
