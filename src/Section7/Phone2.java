package src.Section7;

public abstract class Phone2 {
    String owner;

    Phone2(String owner){
        this.owner=owner;
    }
void turnOn(){
    System.out.println("휴대폰을 켭니다");
}
void turnOff(){
    System.out.println("휴대폰을 끕니다");
}
}
