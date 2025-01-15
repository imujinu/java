package src.Ch12;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String data1 = "홍길동%이수홍,박연수";
        String[] arr = data1.split("%|,");

        for(String token : arr){
            System.out.println(token);
        }

        System.out.println();

        String data2 = "홍길동/이수홍/박연수";

        StringTokenizer st = new StringTokenizer(data2,"/");
        System.out.println(st);
        while(st.hasMoreTokens()) {
            String data3 = st.nextToken();
            System.out.println(data3);
        }
    }
}
