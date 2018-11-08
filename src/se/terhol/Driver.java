package se.terhol;

/**
 * Driver who can drive driveable vehicles.
 *
 * @author Tereza Holm
 */

public class Driver {
    private Driveable currentVehicle;

    public Driver(Driveable currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    /**
     * Current vehicle accelerates to its maximal speed.
     */
    public void straightaway() {
        while (currentVehicle.getCurrentSpeed() < currentVehicle.getMaxSpeed()) {
            currentVehicle.accelerate();
        }
    }

    /**
     * Current vehicle slows down to half of its current speed.
     */
    public void driveCarefully() {
        int halfOfCurrentSpeed = currentVehicle.getCurrentSpeed() / 2;
        while (currentVehicle.getCurrentSpeed() > halfOfCurrentSpeed) {
            currentVehicle.slowDown();
        }
    }

    /**
     * Current vehicle stops.
     */
    public void stop() {
        while (currentVehicle.getCurrentSpeed() > 0) {
            currentVehicle.slowDown();
        }

    }
}
