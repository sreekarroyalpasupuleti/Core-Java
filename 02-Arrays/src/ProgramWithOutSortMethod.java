public class ProgramWithOutSortMethod {
    public static void main(String... args) {

        int arr [ ] = { 18, 28, 29, 52, 71, 46 } ;

        int min = arr [ 0 ];
        int max = arr [ 0 ] ;

        for ( int i = 0 ; i < arr.length ; i++){
            if ( arr [ i ] > max ) {
                max = arr [ i ] ;
            }
            if ( arr [ i ] < min ){
                min  = arr [ i ];
            }
        }
        System.out.println ( " Min Element :: " + min );
        System.out.println (" Max Element :: " + max);
    }
}

