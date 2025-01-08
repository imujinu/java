package src.Section7;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new Hankook();
        mycar.run();

        mycar.tire = new Kumho();
        mycar.run();
    }
}
