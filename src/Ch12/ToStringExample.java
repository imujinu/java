package src.Ch12;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String str = myPhone.toString();
        System.out.println(str);

        System.out.println(myPhone);
    }
}
