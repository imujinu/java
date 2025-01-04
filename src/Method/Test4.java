package src.Method;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while(true){
            System.out.println("-------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

           switch (choice){
               case 1:
                   System.out.print("입금액을 입력하세요 : ");
                   int deposit = scanner.nextInt();
                   scanner.nextLine();
                   balance = deposit(balance,deposit);
                   break;
               case 2:
                   System.out.println("출금액을 입력하세요 : ");
                   int withdraw = scanner.nextInt();
                   scanner.nextLine();
                   balance = withdraw(balance,withdraw);
                   break;
               case 3:
                   System.out.println("현재 잔액 : " + balance);
                   break;
               case 4:
                   System.out.println("시스템을 종료합니다");
                   return;
           }

        }
    }
    public static int deposit(int a, int b){


        a+=b;
        System.out.println(b + "원을 입급하셨습니다.");
        System.out.println("현재 잔액 : " + a  + "원");
        return a;
    }
    public static  int withdraw(int a, int b){

        if( a>b){
            a-=b;
            System.out.println(b + "원을 출금하셨습니다.");
            System.out.println("현재 잔액 : " + a + "원");
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
        return a;
    }
}
