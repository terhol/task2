package se.terhol;

/**
 * Passenger who can travel by public transport.
 *
 * @author Tereza Holm
 */
public class Passenger {
    private PublicTransport currentVehicle;

    /**
     * Passenger starts travelling by a vehicle.
     *
     * @param vehicle vehicle which passenger uses
     * @return TRUE if passenger successfully enters vehicle, FALSE otherwise
     */
    public boolean getOn(PublicTransport vehicle) {
        if (vehicle == null || this.currentVehicle != null) {
            return false;
        }
        this.currentVehicle = vehicle;
        return true;
    }

    /**
     * Passenger stops travelling by a vehicle.
     *
     * @return TRUE if passenger successfully leaves vehicle, FALSE otherwise
     */
    public boolean getOff() {
        if (this.currentVehicle == null) {
            return false;
        }
        this.currentVehicle = null;
        return true;
    }

    public String toString() {
        return this.currentVehicle == null ? "I'm not travelling" : "Travelling towards " + this.currentVehicle.directsTo();
    }
}
