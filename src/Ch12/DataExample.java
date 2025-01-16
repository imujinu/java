package src.Ch12;

import java.text.*;
import java.util.*;

public class DataExample {
    public static void main(String[] args) {
        Date now = new Date();
        String str = now.toString();
        System.out.println(str);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        String str2 = sdf.format(now);
        System.out.println(str2);
    }

}
