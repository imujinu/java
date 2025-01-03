package src.Array;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10;
        String[] product = new String[max];
        int[] price = new int[max];
        int count = 0;

       while(true){
           System.out.println("1. 상품  등록 | 2. 상품 목록 | 3. 종료 \n 메뉴를 선택하세요 : ");
           int menu = scanner.nextInt();
           scanner.nextLine();

           if(menu==1){
               System.out.println("상품 이름을 입력하세요 : ");
               product[count] = scanner.nextLine();

               System.out.println("상품 가격을 입력하세요 : ");
               price[count] = scanner.nextInt();
               scanner.nextLine();

               count++;

           }

           if(menu==2){
               if(count ==0){
                   System.out.println("등록된 상품이 없습니다.");
                   continue;
               }
               else{
                   for ( int i = 0; i<count; i++){
                       System.out.println(product[i]);
                       System.out.println(price[i]);
                   }
               }
           }
           if(menu==3){
               System.out.println("프로그램을 종료합니다.");
               break;
           }
        }
    }
}
