package src.Section7;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r){
        System.out.println("Compter에서 실행되는 중입니다.");
        return Math.PI * r *r ;
    }
}
