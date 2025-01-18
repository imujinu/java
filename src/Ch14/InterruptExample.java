package src.Ch14;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread2 printThread2 = new PrintThread2();
        printThread2.start();

        try{Thread.sleep(2000);}catch(Exception e) {}

        printThread2.interrupt();
    }
}
