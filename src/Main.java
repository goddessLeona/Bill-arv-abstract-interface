public class Main {
    public static void main(String[] args) {

        System.out.println("Program started");

        SystemVihicle systemV = new SystemVihicle();
        systemV.test();

        AnimalSystem systemA = new AnimalSystem();
        systemA.runSystem();

        GameSystem systemG = new GameSystem();
        systemG.testGame();

        ElectronicSystem systemE = new ElectronicSystem();
        systemE.testElectronic();

    }

}