/**
 * 
 */
public class Segment {

    private String marketerFlightNumber;
    private Airline airlineMarketer;
    private Flight flight;

    /**
     * Default constructor
     */
    public Segment( 
        String marketerFlightNumber, 
        Airline airlineMarketer, 
        Flight flight) {
            this.marketerFlightNumber = marketerFlightNumber;
            this.airlineMarketer = airlineMarketer;
            this.flight = flight;
    }

}