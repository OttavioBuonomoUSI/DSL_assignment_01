/**
 * 
 */
public class Seat {

    private String seatNumber;
    private Cabin cabin;
    private Passenger passenger;

    public enum Cabin{
        ECONOMY, 
        BUSINESS, 
        FIRST
    }

    /**
     * Default constructor
     */
    public Seat(String seatNumber, Cabin cabin) {
        this.seatNumber = seatNumber;
        this.cabin = cabin;
    }

    public void addPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void removePassenger() {
        this.passenger = null;
    }

    public String getSeatId() {
        return this.seatNumber;
    }

}