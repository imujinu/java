package src.Class.section14;

public class ShopExample {
    public static void main(String[] args) {
        Shop obj1 = Shop.getInstance();
        Shop obj2 = Shop.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객체입니다");
        }
    }
}
