package src.Class.section14;

public class Shop {

    private static Shop single = new Shop();

    private Shop(){};

     public static Shop getInstance(){
        return single;
    }
}
