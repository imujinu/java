package src.Ch13;

public class GenericExample2 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
//        Home home = new Home();
//        home.turnOnLight();

        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();


    }
}
