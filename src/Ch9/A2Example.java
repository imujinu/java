package src.Ch9;

public class A2Example {
    public static void main(String[] args) {
        A2.B b = new A2.B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A.B.field2);
        A.B.method2();


    }
}
