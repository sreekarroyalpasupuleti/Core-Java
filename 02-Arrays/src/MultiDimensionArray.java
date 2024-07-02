import java.util.*;
    public class MultiDimensionArray {

        public static void main(String... args){

            int arr [ ] [ ] = new int [ 2 ] [ 2 ];

            arr [0] [0] = 750 ;
            arr [0] [1] = 890;
            arr [1] [0] = 840;
            arr [1] [1] = 680;

            for (int i = 0; i < arr.length ; i ++ ){

                for ( int j = 0; j <arr.length ; j ++ ){
                    System.out.println( arr[i] [j] );
                }
            }

        }
    }
