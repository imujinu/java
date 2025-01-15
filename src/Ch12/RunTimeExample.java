package src.Ch12;

public class RunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for(int i = 0; i<100000 ; i++){
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println(sum);
        System.out.println("계산 까지 걸린 시간은 : " + (time2-time1));
    }
}
