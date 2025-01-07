package src.Class;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("12345678-4567895", "임진우");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

//        k1.ssn = "ssdd";
//        k1.name =" 김진우";
        System.out.println(k1.name);

    }
}
