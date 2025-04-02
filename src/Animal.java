public abstract class Animal {

    private String eat;
    private String origen;

    public Animal(String eat, String origen) {
        this.eat = eat;
        this.origen = origen;
    }

    public String getEat() {
        return eat;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }

    public abstract void makeSounds();
}
