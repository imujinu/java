package src.Section7;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();

        Child child2 = (Child) parent;

        child2.method3();
    }
}
