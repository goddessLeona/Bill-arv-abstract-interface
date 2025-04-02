public class ElectronicSystem {

    ElectronicDevice phone1 = new Smartphone("Samsung");
    Smartphone phone2 = new Smartphone("Iphone");
    ElectronicDevice laptop1 = new Laptop("Apple");
    Laptop laptop2 = new Laptop("Thinkpad");

    public void testElectronic(){

        System.out.println("\nUppgift 5");

        phone1.turnOn();
        phone2.turnOn();
        laptop1.turnOn();
        laptop2.turnOn();

        System.out.println("\n2 diferent ways to use the charge metod depending on how you add Object");

        phone2.charge();
        laptop2.charge();

        if(phone1 instanceof Rechargebale){
            ((Rechargebale)phone1).charge();
        }

        if(laptop1 instanceof Rechargebale){
            ((Rechargebale)laptop1).charge();
        }

        System.out.println("\nExercise finished");


    }

}

