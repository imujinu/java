package src.Object;

public class Car {
    String company = "기아";
    String model;
    String color;
    int maxSpeed;

    Car(){};
    Car(String model){
        this.model = model;
        this.color = "검은색";
        this.maxSpeed= 250;
    };
    Car(String model,String color){
        this.model = model;
        this.color = color;
        this.maxSpeed = 200;

    };
    Car(String model,String color,int maxSpeed){
        this.model = model;
        this.color =color;
        this.maxSpeed= maxSpeed;
    };
}
