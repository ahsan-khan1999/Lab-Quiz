import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Plane plane = new Plane("mask", 04, 200, 300, 25, 02, 20);
        ArrayList<Refreshement> refreshements = new ArrayList<>();

        refreshements.add(0,"refreshement1");
        refreshements.add(0,"refreshement2");

        PublicTransport publicTransport = new PublicTransport("Buss", 04, 25, 25.02);
        publicTransport.setNoOfPassengers(214);
        publicTransport.setFare(8900.0);

        plane.addPassanger(6);
        System.out.println(plane.getFare());

        Bus bus = new Bus("Buses",4,356,256.02,02)
        bus.setFare(3200.00);
        bus.addConductors(2);

    }
}
