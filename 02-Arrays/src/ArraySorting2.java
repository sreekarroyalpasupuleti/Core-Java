import java.util.Arrays;

 public class ArraySorting2 {
        public static void main(String[] args) {

            int arr[] = { 14, 89, 72, 36, 63, 45 };
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if ( arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
