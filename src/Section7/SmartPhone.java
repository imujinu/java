package src.Section7;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color){
        super(model, color);
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
