import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Passenger
        Passenger AG = new Passenger("Alex Geek");

        // Airports
        Airport syd = new Airport("SYD", "Sydney");
        Airport lax = new Airport("LAX", "Los Angeles");
        // Airline
        Airline OA = new Airline("Ocean Airlines", "OX");

        // Way forward (SYD-LAX) //

        // Aircraft and seats
        Aircraft aircraft1 = new Aircraft("77W", OA);
        Seat seatAGseg1 = new Seat("3A", Cabin.BUSINESS, AG);
        aircraft1.AddSeat(seatAGseg1);
        // Flight (1-1 with Segment)
        Flight sydlaxf = new Flight("815", OA, syd, lax, aircraft1);
        // Segments
        Segment sydlaxs = new Segment("815", OA, sydlaxf);

    
        // Way back (LAX-HOL-SYD) //

        // New airport
        Airport hol = new Airport("HNL", "Honolulu");

        // (New) Marketed Airline
        Airline PAA = new Airline("Pan Am Airlines", "PX");

        // Aircrafts and seats

        Aircraft aircraft2 = new Aircraft("339", OA);
        Seat seatAGseg2 = new Seat("44A", Cabin.ECONOMY, AG);
        aircraft2.AddSeat(seatAGseg2);
        // (First) Flight
        Flight laxholf = new Flight("700", OA, lax, hol, aircraft2);
        // (First) Segment
        Segment laxhols = new Segment("700", OA, laxholf);

        Aircraft aircraft3 = new Aircraft("359", PAA);
        Seat seatAGseg3 = new Seat("45K", Cabin.ECONOMY, AG);
        aircraft3.AddSeat(seatAGseg3);
        // (First) Flight
        Flight holsydf = new Flight("100", PAA, hol, syd, aircraft3);
        // (First) Segment
        Segment holsyds = new Segment("403", OA, holsydf);

        // Trips
        List<Trip> trips = new ArrayList<Trip>();

        // Trip 1 (Way-forward)
        Trip departureTrip = new Trip(lax, syd);
        departureTrip.addSegment(sydlaxs);

        // Trip 2 (Way-back)
        Trip arrivalTrip = new Trip(syd,lax);
        arrivalTrip.addSegment(laxhols);
        arrivalTrip.addSegment(holsyds);

        // Add trips to the list
        trips.add(departureTrip);
        trips.add(arrivalTrip);

        // Booking
        Booking book = new Booking("1234QWERTY");

        // (Simulation) Passenger "Alex Geek"
        book.addPassenger(AG);
        book.addTrip(departureTrip);
        book.addTrip(departureTrip);
        
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