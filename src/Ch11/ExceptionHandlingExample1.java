package src.Ch11;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }catch(Error e){
//            System.out.println("e.getMessage :: "+e.getMessage());
//            System.out.println("toString :: " + e.toString());
            e.printStackTrace();
        }


        finally {
            {
                System.out.println("[마무리 실행] \n");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("thisisJava");
//        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
