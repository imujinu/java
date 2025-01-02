package src.Array;

public class Test1 {

    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};
        int sum = 0;
        int count = 0;
        double average= (double) 0;
        for (int student : students) {
            sum += student;
            count++;
            average=sum/count;
            System.out.println("점수 총합은 : " + sum);
            System.out.println("점수 평균은 : " + average);

        }
    }

}
