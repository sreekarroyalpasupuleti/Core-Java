
// Write a java program to print Right Triangle Star Pattern

public class RightTriangleStarPattern {
        public static void main(String... args) {

            for( int i = 5; i<=10 ; i ++ ){

                for( int j = 5; j<=i ; j++ ){
                    System.out.print ("* ");
                }

                System.out.println();
            }
        }

}
// * * * * *
//* * * * * *
//* * * * * * *
//* * * * * * * *
//* * * * * * * * *
//* * * * * * * * * *