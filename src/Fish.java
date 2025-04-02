public class Fish extends Animal implements Swimmable{

    public Fish(String eat, String origen) {
        super(eat, origen);
    }

    @Override
    public void makeSounds() {
        System.out.println("Blub blubb");
    }

    @Override
    public void swim() {
        System.out.println("The fish swim");
    }
}
