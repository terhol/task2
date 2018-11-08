package se.terhol;

/**
 * Vehicle tram.
 *
 * @author Tereza Holm
 */
public class Tram implements PublicTransport, Driveable {
    public static final int GENERALMAXSPEED = 50;
    private String terminalStation1;
    private String terminalStation2;
    private boolean isGoingTowards = true;
    private int currentSpeed;
    private int maxSpeed;

    public Tram(String terminalStation1, String terminalStation2) {
        this.terminalStation1 = terminalStation1;
        this.terminalStation2 = terminalStation2;
        this.maxSpeed = GENERALMAXSPEED;
    }

    public Tram(String terminalStation1, String terminalStation2, int maxSpeed) {
        this.terminalStation1 = terminalStation1;
        this.terminalStation2 = terminalStation2;
        if (maxSpeed <= 0) {
            this.maxSpeed = GENERALMAXSPEED;
        } else this.maxSpeed = maxSpeed;
    }

    @Override
    public String directsTo() {
        return this.isGoingTowards ? this.terminalStation2 : this.terminalStation1;
    }

    @Override
    public void changeDirection() {
        this.isGoingTowards = !this.isGoingTowards;

    }

    @Override
    public int accelerate() {
        if (currentSpeed < maxSpeed) {
            this.currentSpeed += 1;
        }
        return this.currentSpeed;
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int slowDown() {
        if (currentSpeed > 0) {
            this.currentSpeed -= 1;
        }
        return this.currentSpeed;
    }


    public String toString() {
        return "Tram: " + getCurrentSpeed() + "km/h";
    }
}
