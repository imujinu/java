package src.Section7;

public class DriverExample {
    public static void main(String[] args) {
        Driver mydriver = new Driver();

        Bus bus = new Bus();
        mydriver.drive(bus);

        Taxi taxi = new Taxi();
        mydriver.drive(taxi);

    }

}
