package src.Method;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(average(1,2,3));
    }

   public static double average(int a, int b, int c){

        int sum = a+b+c;
        return sum / 3;

   }
}