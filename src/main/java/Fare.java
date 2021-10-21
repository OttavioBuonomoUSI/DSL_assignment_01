public class Fare {

    private Cabin fareClass;
    private FareType fareType;
    private String fareCode;

    public Fare(String fareCode, FareType fareType, Cabin fareClass) {
        this.fareCode = fareCode;
        this.fareType = fareType;
        this.fareClass = fareClass;
    }
    
}
