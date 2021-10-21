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
    private Queue<Segment> segments;

    /**
     * Default constructor
     */
    public Trip(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        segments = new LinkedList<Segment>();
    }

    /**
     * 
     * @param segment
     */
    public void addSegment(Segment segment){
        segments.add(segment);
    }




}