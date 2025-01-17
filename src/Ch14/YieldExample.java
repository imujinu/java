package src.Ch14;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread ThreadA = new WorkThread("ThreadA");
        WorkThread ThreadB = new WorkThread("ThreadB");

        ThreadA.start();
        ThreadB.start();

        try{Thread.sleep(5000);}catch(Exception e){};
        ThreadA.work = false;

        try{Thread.sleep(5000);}catch(Exception e){};
        ThreadA.work = true;
    }
}
