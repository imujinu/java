package src.String;

import java.util.Calendar;

public class Day {
    public static void main(String[] args) {
        Enum today = null;
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);

        switch (day){
            case 1 : today = Enum.MONDAY; break;

            case 2 : today = Enum.TUESDAY; break;
            case 3 : today = Enum.WEDNESDAY; break;
            case 4 : today = Enum.TURSDAY; break;
            case 5 : today = Enum.FRIDAY; break;
            case 6 : today = Enum.SATURDAY; break;
            case 7 : today = Enum.SATURDAY;break;
        }
        if( today != Enum.FRIDAY){
            System.out.println("오늘은 불금이 아닙니다");
        }else{

            System.out.println("오늘은 불금입니다.");
        }
    }
}
