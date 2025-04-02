public class AnimalSystem {

    Animal dog = new Dog("bone", "Australia");
    Animal fish = new Fish("alger","icland");

    public void runSystem(){

        System.out.println("\nMedelsvåra Övningar (Kombinera abstrakta klasser och interface)");
        System.out.println("\nUppgift 3");
        dog.makeSounds();
        fish.makeSounds();

        if(fish instanceof Swimmable){
            ((Swimmable)fish).swim();
        }
    }

}
