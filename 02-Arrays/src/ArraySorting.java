import java.util.Arrays;

 public class ArraySorting {

    public static void main(String[] args) {

        int arr[] = { 5, 8, 2, 6, 9, 11 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }

}


