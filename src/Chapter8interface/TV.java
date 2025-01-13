package src.Chapter8interface;

public class TV implements Remocon{
    @Override
    public void powerOn(){
        System.out.println("tv를 켭니다");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
