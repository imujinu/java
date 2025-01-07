package src.Section7;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color){
        this.model = model;
        this.color=color;
    }

    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void call(){
        System.out.println("전화받았습니다.");
    }
}
