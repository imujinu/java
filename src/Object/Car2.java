package src.Object;

public class Car2 {
    String company = "기아";
    String model;
    String color;
    int maxSpeed;

    Car(){};
    Car(String model){
        this(model,"검은색",250);
    };
    Car(String model,String color){
        this(model,color,200);
    };
    Car(String model,String color,int maxSpeed){
        this.model = model;
        this.color =color;
        this.maxSpeed= maxSpeed;
    };
}
