package src.Ch14;

public class WorkObject {
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행 중");

        notify();

        try{
            wait();
        }catch(Exception e) {}


    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행 중");
        notify();
        try{wait();} catch(Exception e){}
    }
}
