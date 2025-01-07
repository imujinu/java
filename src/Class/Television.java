package src.Class;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        System.out.println(1);
        info = company + "-" + model;
    }
    static{
        System.out.println(2);
    }

}
