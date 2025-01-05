package src.Object;

public class KoreaExample {
    public static void main(String[] args) {

    Korea k = new Korea("임진우", "980908-1000000");
    Korea k2 = new Korea("임진우2" , "897872-13203232");
        System.out.println(k.nation);
        System.out.println(k.name);
        System.out.println(k.ssn);
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
