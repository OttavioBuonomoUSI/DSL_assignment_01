import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 */
public class Trip {

    private Airport departureAirport;
    private Airport arrivalAirport;
    private List<Segment> segments;

    /**
     * Default constructor
     */
    public Trip() {
        segments = new LinkedList<Segment>();
    }

    /**
     * 
     * @param segment
     */
    public void addSegment(Segment segment){
        segments.add(segment);
        setDepartureAirport();
        setArrivalAirport();
    }

    private void setDepartureAirport() {
        departureAirport = segments.get(0).getDepartureAirport();
    }

    private void setArrivalAirport() {
        arrivalAirport = segments.get( segments.size()-1 ).getArrivalAirport();
    }




}