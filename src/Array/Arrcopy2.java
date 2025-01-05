package src.Array;

public class Arrcopy2 {
    public static void main(String[] args) {
        int[] scores = {95,85,68,38,98};

        int sum= 0;

        for(int score : scores){
            sum+=score;
        }

        int average = sum/scores.length;

        System.out.println(average);
    }
}
