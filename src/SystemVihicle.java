import java.sql.SQLOutput;

public class SystemVihicle {

    // make a object a new Car and bike
    Vihicle car = new Car(180,"Saab","blue");
    Vihicle bike = new Bicyckle(30,"BMX");
    Vihicle plane = new Airplain(200,"fastplane");
    Bird bird = new Bird("Skata","nuts");

    public void test(){

        System.out.println("\nGrundläggande Övningar (Förståelse av koncept)");

        System.out.println("\nUppgift 1");
        car.move();
        bike.move();


        System.out.println("\nUppgift 2");
        plane.move();

        if(plane instanceof Flyable){
            ((Flyable)plane).fly();
        }

        bird.fly();

    }
}
