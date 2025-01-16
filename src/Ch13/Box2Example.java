package src.Ch13;

public class Box2Example {

    public static <T> Box2<T> boxing(T t) {
        Box2<T> box = new Box2<T>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {

        Box2<Integer> box1 = boxing(100);  // Box2로 수정
        int intValue = box1.get();
        System.out.println(intValue);

        Box2<String> box2 = boxing("홍길동");  // Box2로 수정
        String stringValue = box2.get();
        System.out.println(stringValue);
    }
}
