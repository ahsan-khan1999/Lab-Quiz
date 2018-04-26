public class Plane extends PublicTransport{

    private int noOfPropellers;
    private int plotsRequired;
    private int noOfHosts;


    public Plane(String name, int noOfTyers, int noOfPassengers, double fare, int noOfPropellers, int plotsRequired, int noOfHosts) {
        super(name, noOfTyers, noOfPassengers, fare);
        this.noOfPropellers = noOfPropellers;
        this.plotsRequired = plotsRequired;
        this.noOfHosts = noOfHosts;
    }

    public int getNoOfPropellers() {
        return noOfPropellers;
    }

    public void setNoOfPropellers(int noOfPropellers) {
        this.noOfPropellers = noOfPropellers;
    }

    public int getPlotsRequired() {
        return plotsRequired;
    }

    public void setPlotsRequired(int plotsRequired) {
        this.plotsRequired = plotsRequired;
    }

    public int getNoOfHosts() {
        return noOfHosts;
    }


    public void setNoOfHosts(int noOfHosts) {
        this.noOfHosts = noOfHosts;
    }


    public void addPassanger(int noOfPassengers){


        noOfPassengers++;
    }

    public void fare(int noOfPassengers){
        double fare= getFare() * noOfPassengers;

        fare = fare / noOfPassengers;

    }
}
