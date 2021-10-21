
import java.util.*;
/**
 * 
 */
public class Booking {

    private List<Trip> trips;
    private List<Passenger> passengers;
    private String referenceNumber;

    /**
     * Default constructor
     * @param trips2
     */
    public Booking(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        trips = new ArrayList<Trip>();
        passengers = new ArrayList<Passenger>();
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


}