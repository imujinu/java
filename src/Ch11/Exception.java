package src.Ch11;

public class Exception {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i=0; i<= array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            }
//            catch(java.lang.Exception e){
//                System.out.println(e.toString());
//            }
            catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
            }
        }
    }
}
