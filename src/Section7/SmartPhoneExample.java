package src.Section7;

public class SmartPhoneExample {
    public static void main(String[] args) {

        SmartPhone myphone = new SmartPhone("갤럭시S24", "화이트");
        System.out.println(myphone.model);
        System.out.println(myphone.color);

        myphone.bell();
        myphone.call();
        myphone.internet();




    }
}
