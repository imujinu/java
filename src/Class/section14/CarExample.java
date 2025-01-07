package src.Class.section14;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.setSpeed(-50);
        System.out.println(mycar.getSpeed());

        if(!mycar.isStop()){
            mycar.setStop(true);
        }
        System.out.println(mycar.getSpeed());
    }
}
