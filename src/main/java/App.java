import java.io.Console;
import java.util.ArrayList;
import java.util.List;

// Example
// Passenger Alex Geek has a booking with two trips, 
// from Sydney - SYD to Los Angeles - LAX and back (LAX to SYD). 
// The first trip has only one segment, from SYD to LAX, marketed 
// and operated by Oceanic Airlines (IATA code OX) with flight number 815. 
// The reserved seat for the passenger is 3A in business class.
// On the way back, the trip has two segments, 
// from SYD to HNL (Honolulu) and from HNL to LAX. 
// The first segment is marketed and operated by 
// Oceanic Airlines with flight number 700, 
// and the second segment is marketed by Oceanic Airlines with flight number 403, 
// but operated by Pan Am Airlines with flight number 100. 
// Seat reservations are for seats 44A and 45K respectively, in economy class.
// The first trip has a business fare with code DFFAU, 
// a flexible fare, that costs 4500 US dollars, 
// while the return trip has an economy fare with code LLLAU 
// (standard fare) that costs 1000 US dollars.

public class App {
    public static void main(String[] args) {

        // Airports
        Airport gva = new Airport("GVA", "Geneva");
        Airport zrh = new Airport("ZRH", "Zurich");
        Airport lax = new Airport("LAX", "Los Angeles");
        Airport cdg = new Airport("CDG", "Parigi");

        // Airlines
        Airline LX = new Airline("Swiss", "LX");

        // Way forward (GVA-ZRH-LAX) //
        
        // Segment (1) 
        Aircraft aircraft1 = new Aircraft("77W", LX);        
        Passenger AG = new Passenger("Alex Geek", aircraft1.getSeatById("15D"));
        aircraft1.setSeatToPassenger("15D", AG);
        Segment gvazrh = new Segment("1711", LX, gva, zrh, aircraft1);

        // Segment (2)
        Aircraft aircraft2 = new Aircraft("77Z", LX);        
        aircraft2.setSeatToPassenger("9A", AG);
        AG.setNewSeat(aircraft2.getSeatById("9A"));
        Segment zrhlax = new Segment("40", LX, zrh, lax, aircraft2);

        // (Outbound) trip
        Trip gvalaxTrip = new Trip();
        gvalaxTrip.addSegment(gvazrh);
        gvalaxTrip.addSegment(zrhlax);

        // Way back (LAX-CDG-GVA) //

        // Segment (1) 
        Aircraft aircraft3 = new Aircraft("78W", LX);  
        aircraft3.setSeatToPassenger("12C", AG); 
        AG.setNewSeat(aircraft3.getSeatById("12C"));     
        Segment laxcdg = new Segment("42", LX, lax, cdg, aircraft3);

        // Segment (2)
        Aircraft aircraft4 = new Aircraft("78Z", LX);        
        aircraft2.setSeatToPassenger("11B", AG);
        AG.setNewSeat(aircraft2.getSeatById("11B"));
        Segment cdggva = new Segment("39", LX, cdg, gva, aircraft4);

        // (Inbound) trip
        Trip laxgvaTrip = new Trip();
        laxgvaTrip.addSegment(laxcdg);
        laxgvaTrip.addSegment(cdggva);

        // Booking
        Booking gvalaxBooking = new Booking("GVALAX1234");
        gvalaxBooking.addPassenger(AG);
        gvalaxBooking.addTrip(gvalaxTrip);
        gvalaxBooking.addTrip(laxgvaTrip);

        System.out.println("Compilo");
        
    }
}

// Notes:
// 1. Need to remove Inbound and Outbound from the Trip (in the diagram). Segments are represented as a queue (dep airport of the first element and the arrival airport of the last element are the inbound and outbound)
// 2. Forgot the cost on segment?
// 3. No IATA code for second airline?
// 3. How do we model marketed and operated segment
// 4. How do we model business fare and costs?
// 5. There seems to be all additional features to be developed
// 6. Flight class with 1-to-1 correspondence with segment added. This allow to distinguish between marketed and operated airline
// N.B. need to test this!