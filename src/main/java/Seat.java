/**
 * 
 */
public class Seat {

    private String seatNumber;
    private Cabin cabin;
    private Passenger passenger;

    /**
     * Default constructor
     */
    public Seat(String seatNumber, Cabin cabin, Passenger passenger) {
        this.seatNumber = seatNumber;
        this.cabin = cabin;
        this.passenger = passenger;
        
    }

}