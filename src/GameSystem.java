public class GameSystem {

    Enemy gobling1 = new Gobling(100);
    Enemy orc1= new Orc(150);
    Enemy darkWisard = new DarkWisard(300);

    public void testGame(){

        System.out.println("\nUppgift 4");
        gobling1.attac();
        orc1.attac();
        darkWisard.attac();

        if(darkWisard instanceof MagicUser ){
            ((MagicUser)darkWisard).castSpell();
        }

    }

}
