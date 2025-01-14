package src.Ch11;

public class Throws {
    public static void main(String[] args) {
        try{findClass();}catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
