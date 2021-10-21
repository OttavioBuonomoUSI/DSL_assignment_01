import java.util.*;
/**
 * 
 */
public class Aircraft {

    private String aircraftCode;
    private List<Seat> seats;
    private Airline airlineOperator;    

    /**
     * Default constructor
     */
    public Aircraft(String aircraftCode, Airline airlineOperator) {
        this.aircraftCode = aircraftCode;
        this.airlineOperator = airlineOperator;
        seats = new ArrayList<Seat>();
    }

    public void AddSeat(Seat newSeat) {
        seats.add(newSeat);
    }

}