package src.Ch14;

public class PrintThread2 extends Thread{
    public void run(){
        try{
            while (true){

            System.out.println("실행중");
            Thread.sleep(1);
            }
        }catch(Exception e){
            System.out.println("리소스 정리");
            System.out.println("실행종료");
        }
    }
}
