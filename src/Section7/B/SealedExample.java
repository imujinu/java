package src.Section7.B;

public class SealedExample {
    public static void main(String[] args) {
        Perosn p = new Perosn();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
