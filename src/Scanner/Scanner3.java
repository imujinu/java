package src.Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫  번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("두  번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int sum = num1 - num2;
      if (sum <= -1){
           System.out.println("num2가 더 큽니다");}
      else if(sum == 0)
      {System.out.println("num1과 num2가 같습니다");}
      else {
            System.out.println(("num1이 더 큽니다"));}




    }
}
