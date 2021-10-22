import java.util.*;

/**
 * 
 */
public class Aircraft {

    private String aircraftCode;
    private Map<Seat, Passenger> seats;
    private Airline airlineOperator;    

    /**
     * Default constructor
     */
    public Aircraft(String aircraftCode, Airline airlineOperator) {
        this.aircraftCode = aircraftCode;
        this.airlineOperator = airlineOperator;
        initSeats(); // initialize seats
    }

    private void initSeats() { 
        seats = new HashMap<>();
        // initialize the seats configuration based on the aircraft
    }

    public Seat getSeatById(String seatId) {
        return this.seats
            .keySet()
            .stream()
            .filter(s -> s.getSeatId() == seatId)
            .findFirst()
            .get();
    }

    public void setSeatToPassenger(String seatId, Passenger passenger) {
        this.seats.put(getSeatById(seatId), passenger);
    }

}