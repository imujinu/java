package src.Ch14;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sum = new SumThread();
        sum.start();

        try{
            sum.join();
        }catch(InterruptedException e){

        }

        System.out.println(sum.getSum());

    }
}
