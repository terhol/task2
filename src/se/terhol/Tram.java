package se.terhol;

/**
 * Vehicle tram.
 *
 * @author Tereza Holm
 */
public class Tram implements PublicTransport {
    private String terminalStation1;
    private String terminalStation2;
    private boolean isGoingTowards = true;

    public Tram(String terminalStation1, String terminalStation2) {
        this.terminalStation1 = terminalStation1;
        this.terminalStation2 = terminalStation2;
    }

    @Override
    public String directsTo() {
        return this.isGoingTowards ? this.terminalStation2 : this.terminalStation1;
    }

    @Override
    public void changeDirection() {
        this.isGoingTowards = !this.isGoingTowards;

    }
}
