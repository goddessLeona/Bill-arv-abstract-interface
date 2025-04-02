public class Bird implements Flyable {

    private String name;
    private String eat;

    public Bird(String name, String eat) {
        this.name = name;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public String getEat() {
        return eat;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Bird fly using its wings");
    }
}
