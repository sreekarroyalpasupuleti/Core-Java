//Write a  java program to reverse an array ?


class Reverse {

    public static void main(String... args) {

        int arr [ ] = { 18, 1, 56, 12, 13, 14, 17 } ;

        int temp = 0;

        for ( int i = 0; i < arr.length/2  ; i++ ){
            temp = arr [ i ];
            arr [ i ] = arr [ arr.length - 1 - i ];
            arr [ arr.length-1 - i ] = temp;
        }

        for( int n : arr){
            System.out.print ( n + " " );
        }

    }
}

