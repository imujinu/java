package src.Scanner;
import java.util.Scanner;
public class Scanner7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;


        while(true){
            System.out.print("1 : 상품 입력, 2: 결제 입력, 3 : 프로그램 종료 :");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            if(num1 ==1){
                System.out.print("상품명을 입력하세요 : " );
                String product1 = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("구매 수량을 입력하세요 : ");
                int number = scanner.nextInt();
                scanner.nextLine();

                sum += price*number;
                System.out.println("상품명 : " + product1 + "가격 : " + price + "합계 " + price * number);
            }
        else if(num1 ==2){
                System.out.println("총 비용 :" + sum);
                sum = 0;
            }

        else if(num1 ==3){
            System.out.println("프로그램을 종료합니다.");
            break;
        }

        }
    }
}
