package src.Ch12;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter" , "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "눈송이",25);
        Member m2 = new Member("summber", "장마", 30);
        System.out.println("m1.hashCode" + m1.hashCode());
        System.out.println("m2.hashCOde"+ m2.hashCode());
        System.out.println("m1.equlas" + m1.equals(m2));
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
