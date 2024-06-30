import java.util.*;

    public class FindMinAndMax {

        public static void main(String... args) {

            int arr [ ] = { 99, 8, 9, 1, 11, 4 } ;

            Arrays.sort(arr);

            System.out.println ("Min Element : " + arr [ 0 ] );

            System.out.println("Max Element : " + arr [ arr.length - 1 ] );
        }
    }