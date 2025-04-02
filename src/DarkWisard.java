public class DarkWisard extends Enemy implements MagicUser{

    public DarkWisard(int health) {
        super(health);
    }

    @Override
    public void attac() {
        System.out.println("Dark Wisard attac's");
    }

    @Override
    public void castSpell() {
        System.out.println("Dark Wisard is troghing a spell");
    }
}
