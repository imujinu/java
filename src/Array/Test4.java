package src.Array;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 갯수를 입력해주세요 : ");
        int num = scanner.nextInt();

        int [] arr = new int[num];

        System.out.println(num+ "개의 정수를 입력하세요 : ");

        int sum = 0;
        double average = (double)0;
        for ( int i = 0; i<arr.length ; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
            average = sum/arr.length;
        System.out.print("총합은 : " + sum );
        System.out.print("평균은 : " + average);

    }
}
