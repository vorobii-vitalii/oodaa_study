package example5;

public class DogDoorTest {

    public static void main(String [] args) {
        DogDoor door = new DogDoor ();
        Remote remote = new Remote ( door );
        System.out.println ( "Fido barks to go outside" );
        remote.pressButton ();
        System.out.println ( "\n Fido has gone outside" );
        System.out.println ( "\n Fidos all done...");
        remote.pressButton ();
    }

}
