package src.Method;

public class Test3 {
    public static void main(String[] args) {
        deposit(10000, 1000);
        withdraw(10000, 2000);
    }

    public static int deposit(int a, int b){
        int sum = a+b;
        System.out.println(b + "원을 입급하였습니다. 현재 잔액 : " + a + "원");
        return sum;
    }

    public static int withdraw(int a, int b){
        if(a>b){
          int sum = a-b;
            System.out.println(b + " 원을 출금하였습니다. 현재 잔액 : " + a + "원");
        }else{
            System.out.println(b + "원을 출금하려 했으나 잔액이 부족합니다. ");
        }
    return ;}
}
