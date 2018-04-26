import java.util.ArrayList;

public class PublicTransport {

    private String name;
    private int noOfTyers;
    private int noOfPassengers;
    private double fare;

//    Refreshement refreshement = new Refreshement("OOP","w");


    ArrayList<Refreshement> refreshement = new ArrayList<>();
//    Refreshement(Refreshement refreshementList);

    public PublicTransport(String name, int noOfTyers, int noOfPassengers, double fare) {
        this.name = name;
        this.noOfTyers = noOfTyers;
        this.noOfPassengers = noOfPassengers;
        this.fare = fare;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTyers() {
        return noOfTyers;
    }

    public void setNoOfTyers(int noOfTyers) {
        this.noOfTyers = noOfTyers;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

}
