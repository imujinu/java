package src;


public class While2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3){
            count = ++count;
            System.out.println("현재 숫자는 " + count);
        }
    }
}
