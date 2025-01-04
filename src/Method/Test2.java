package src.Method;

public class Test2 {
    public static void main(String[] args) {
        loop("hi",3);
        loop("bye",3);
        loop("good",5);
    }

    public static void loop (String message, int times){
        for(int i = 0 ; i<times; i++){
            System.out.println(message);
        }
    }
}
