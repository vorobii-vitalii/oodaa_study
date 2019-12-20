package example5;

public class DogDoor {
    private boolean open;

    DogDoor() {
        this.open = false;
    }

    public boolean isOpen () {
        return this.open;
    }

    public void open() {
        System.out.println ( "The door opens" );
        this.open = true;
    }

    public void close () {
        System.out.println ( "The door closes" );
        this.open = false;
    }
}
