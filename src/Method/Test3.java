package src.Method;

public class Test3 {
    public static void main(String[] args) {
        int a = 10000;
        a= deposit(a, 1000);
        a= withdraw(a, 12000);
        System.out.println("남은 잔액은 : " + a + "원 입니다.");
    }

    public static int deposit(int a, int b){
        int sum = a+b;
        System.out.println(b + "원을 입급하였습니다. 현재 잔액 : " + sum + "원");
        return sum;
    }

    public static int withdraw(int a, int b){
        if(a>b){
          int sum = a-b;
            System.out.println(b + " 원을 출금하였습니다. 현재 잔액 : " + sum + "원");

        }else{
            System.out.println(b + "원을 출금하려 했으나 잔액이 부족합니다. ");

        }
        return a;
   }
}
