// Write a java program to print Pyramid pattern
public class PyramidPattern {

        public static void main(String... args) {

            for( int i = 1; i<=5 ; i ++ ){

                for ( int k = 5-i ; k >= 1 ; k-- ){
                    System.out.print(" ");
                }

                for( int j = 1; j<=i ; j++ ){
                    System.out.print ("* ");
                }

                System.out.println();
            }
        }
    }
