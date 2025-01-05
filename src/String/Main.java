package src.String;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("값이 부족합니다.");
            System.exit(0);
        }


        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = num1 + num2 ;
        System.out.println("sum : " + result);


    }
}
