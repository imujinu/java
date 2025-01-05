package src.Array;

public class Arrcopy {
    public static void main(String[] args) {
        String[] arr1 ={"a", "b", "c"};
        String[] arr2 = new String[5];

        System.arraycopy(arr1, 0, arr2, 0 , arr1.length);

        for(int i = 0; i< arr2.length ; i++){
            System.out.println(arr2[i]);
        }

    }
}
