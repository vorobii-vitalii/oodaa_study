package example1;

public class Airplane {
    private int speed;

    Airplane() {
    }

    Airplane(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}