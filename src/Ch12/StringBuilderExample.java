package src.Ch12;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder().append("임진우입니다. 방구 뽕").insert(0, "나는").delete(3,4).toString();
        System.out.println(data);

        int length = data.length();

        String result = data.substring(0, length-3);
        System.out.println(result);
    }
}
