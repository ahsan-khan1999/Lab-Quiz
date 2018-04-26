public class Bus extends PublicTransport {

    private int noOfConductors;

    public Bus(String name, int noOfTyers, int noOfPassengers, double fare,  int noOfConductors) {
        super(name, noOfTyers, noOfPassengers, fare);
        this.noOfConductors = noOfConductors;

    }

    public int getNoOfConductors() {
        return noOfConductors;
    }

    public void setNoOfConductors(int noOfConductors) {
        this.noOfConductors = noOfConductors;
    }

    public void addConductors(int Conductors){
       double fare = getFare() / noOfConductors;
       double fareC = fare * noOfConductors(fare);
       System.out.println(fareC);
       noOfConductors++;

    }
    public void noOfConductor(int no_of_coductors){
        addConductors(no_of_coductors);
    }
}

