package src.Array;

public class Test8 {
    public static void main(String[] args) {
        int [][] mathScores = new int[2][3];

                mathScores[0][0] = 90;
                mathScores[0][1] = 54;
                mathScores[0][2] = 87;
                mathScores[1][1] = 99;
                mathScores[1][1] = 87;
                mathScores[1][2] = 78;

                int sumStudents = 0;
                int mathSum = 0;

                for(int i = 0 ; i<mathScores.length ; i++){
                    sumStudents+=mathScores[i].length;
                    for(int j =0; j<mathScores[i].length ; j++){
                        mathSum += mathScores[i][j];
                    }
                }

                int mathAveragee = mathSum/sumStudents;

        System.out.println(mathAveragee);
    }
}
