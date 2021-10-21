public class Flight {
    
    private String operatorFlightNumber;
    private Airline operatorAirline;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Aircraft aircraft;

    public Flight(
        String operatorFlightNumber, 
        Airline operatoAirline, 
        Airport departureAirport, 
        Airport arrivalAirport,
        Aircraft aircraft) {
            this.operatorFlightNumber = operatorFlightNumber;
            this.operatorAirline = operatoAirline;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.aircraft = aircraft;
    }


}
