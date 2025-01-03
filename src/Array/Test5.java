package src.Array;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = scanner.nextInt();

        System.out.println(num+ "개의 정수를 입력하세요 : ");
        int[] arr = new int[num];

       int minNumber, maxNumber;

        for(int i = 0; i<num ; i++){
            arr[i] = scanner.nextInt();
        }
      minNumber = maxNumber = arr[1];

        for(int i = 0; i<num; i++){
        if(arr[i]> maxNumber){
            maxNumber= arr[i];
        }
        else if( arr[i]<minNumber){
            minNumber = arr[i];
        }

        }
        System.out.println("가장 작은 정수 : " + minNumber) ;
        System.out.println("가장 큰 정수 : " + maxNumber);

    }
}
