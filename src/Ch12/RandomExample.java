package src.Ch12;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호 : ");
        for(int i = 0; i<6 ; i++){
            selectNumber[i] = random.nextInt(45)+1;
            System.out.println(selectNumber[i]);
        }

        int[] winNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨 번호 : ");
        for(int i = 0; i<6 ; i++){
            winNumber[i] = random.nextInt(45)+1;
            System.out.println(winNumber[i]);
            
        }

        Arrays.sort(selectNumber);
        Arrays.sort(winNumber);

        boolean result = Arrays.equals(selectNumber,winNumber);

                if(result){
                    System.out.println("1등입니다!");
                }
                else{
                    System.out.println("꽝입니다.");
                }



    }
}
