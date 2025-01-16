package src.Ch12;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.content = "안녕하세요";
        System.out.println(box.content);

        Box<Integer> box2 = new Box<>();
        box2.content = 200;
        System.out.println(box2.content);
    }
}
