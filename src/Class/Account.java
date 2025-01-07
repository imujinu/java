package src.Class;

public class Account {
    private int balance;
    private static int MIN_BALANCE = 0;
    private static int MAX_BALANCE = 1000000;


    public int getBalance(){
//        System.out.println(this.balance);
        System.out.println("현재 금액은 : " + this.balance + "원 입니다.");
        return balance;
    }

    public int setBalance(int a){
        if(a<MIN_BALANCE || a> MAX_BALANCE){
            System.out.println("잘못된 접근입니다.");
        }else{
            this.balance += a;


        }
        return a;
    }

}
