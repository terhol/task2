package se.terhol;


/**
 * Interface for vehicles of public transport, i.e. vehicles shutteling between
 * two end stations.
 *
 * @author Jan Papousek
 * @author Radek Oslejsek
 */
public interface PublicTransport {
    /**
     * Returns the target end station of the public transport vehicle.
     *
     * @return target station
     */
    String directsTo();

    /**
     * Inverts the direction of transport line (e.g.when the vehicle arrives
     * the end station).
     */
    void changeDirection();
}
