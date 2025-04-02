public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                '}';
    }

    public abstract void attac();
}
