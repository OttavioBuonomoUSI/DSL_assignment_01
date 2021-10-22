/**
 * 
 */
public class Segment {

    private String flightNumber;
    private Airline marketer;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Aircraft aircraft;

    /**
     * Default constructor
     */
    public Segment( 
        String flightNumber, 
        Airline marketer, 
        Airport departureAirport, 
        Airport arrivalAirport,
        Aircraft aircraft) 
        {
            this.flightNumber = flightNumber;
            this.marketer = marketer;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.aircraft = aircraft;
        }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

}