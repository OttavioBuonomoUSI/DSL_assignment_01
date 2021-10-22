
/**
 * 
 */
public class Passenger {

    private String name;
    private Seat seat;

    /**
     * Default constructor
     */
    public Passenger(String name, Seat seat) {
        this.name = name;
        this.seat = seat;
    }

    public void removeSeat() {
        this.seat = null;
    }

    public void setNewSeat(Seat seat) {
        this.seat = seat;
    }

}