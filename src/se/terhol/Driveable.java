package se.terhol;


/**
 * Interface for vehicles which can be driven
 *
 * @author Jan Papousek
 */
public interface Driveable {
    /**
     * It makes the vehicle accelerating, i.e. it increases the speed with 1km/h.
     * The vehicle cannot exceed its maximal speed.
     *
     * @return current speed (after the acceleration)
     */
    int accelerate();


    /**
     * It returns current speed (in km/h)
     *
     * @return current speed
     */
    int getCurrentSpeed();

    /**
     * It returns maximal speed of the vehicle
     *
     * @return maximal sped
     */
    int getMaxSpeed();

    /**
     * It makes the vehicle slowing down with 1 km/h.
     * The minimal speed is 0 km/h.
     *
     * @return current speed (after slowing down)
     */
    int slowDown();

    /**
     * Returns text description of the driveable.
     *
     * @return text description of the driveable
     */
    String toString();
}
