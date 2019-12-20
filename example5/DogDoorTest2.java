package example5;

public class DogDoorTest2 {
    public static void main ( String[] args ) {
        DogDoor door = new DogDoor ();
        Remote remote = new Remote ( door );

        System.out.println ( "Fido scratches at the door" );
        remote.pressButton ();

        System.out.println ( "\nFido has gone outside ..." );
        System.out.println ( "\nFido's all done ..." );
        try {
            Thread.sleep (10_000);
        }
        catch (InterruptedException ignored) {}

        System.out.println ( "but he is stuck outside" );
        System.out.println ( "\nFido starts barking ..." );
        System.out.println ( "so Todd grabs the remote control" );
        remote.pressButton ();
        System.out.println ( "\n Fido's back inside ..." );
    }
}
